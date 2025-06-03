package fossils.fossils.client.blockentity.model.parmastega;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ParmastegaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Parmastega;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Upperjaw;
	private final ModelPart Snout;
	private final ModelPart Jawwhole;
	private final ModelPart Jaw;
	private final ModelPart Jaw2;
	private final ModelPart LArm;
	private final ModelPart LArm2;
	private final ModelPart LArm3;
	private final ModelPart LArm4;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;
	private final ModelPart Tail;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public ParmastegaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Parmastega = this.fossil.getChild("Parmastega");
		this.Neck = this.Parmastega.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Upperjaw = this.Head.getChild("Upperjaw");
		this.Snout = this.Upperjaw.getChild("Snout");
		this.Jawwhole = this.Upperjaw.getChild("Jawwhole");
		this.Jaw = this.Jawwhole.getChild("Jaw");
		this.Jaw2 = this.Jawwhole.getChild("Jaw2");
		this.LArm = this.Parmastega.getChild("LArm");
		this.LArm2 = this.LArm.getChild("LArm2");
		this.LArm3 = this.Parmastega.getChild("LArm3");
		this.LArm4 = this.LArm3.getChild("LArm4");
		this.Body = this.Parmastega.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.LLeg = this.Body2.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.Body2.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
		this.Tail = this.Body2.getChild("Tail");
		this.Tail2 = this.Tail.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Parmastega = fossil.addOrReplaceChild("Parmastega", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, -14.0F, -7.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = Parmastega.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.5F, -1.1882F, -1.76F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.4272F, -0.7463F, 1.3861F, 0.0262F, -0.6322F));

		PartDefinition bodyfront_r2 = Parmastega.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(0.1F, -1.5019F, 0.0511F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.05F, -0.5F, 1.0537F, 0.1946F, -0.0112F));

		PartDefinition bodyfront_r3 = Parmastega.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(44, 34).addBox(-1.1F, -1.5019F, 0.0511F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.05F, -0.5F, 1.0537F, -0.1946F, 0.0112F));

		PartDefinition bodyfront_r4 = Parmastega.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -1.1882F, -1.76F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.4272F, -0.7463F, 1.3861F, -0.0262F, 0.6322F));

		PartDefinition neck_r1 = Parmastega.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(38, 9).addBox(-2.0F, -0.5F, 1.05F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -3.05F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bodyfront_r5 = Parmastega.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(26, 36).addBox(-1.5F, 0.05F, 0.0F, 3.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.6F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition neck_r2 = Parmastega.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(40, 49).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 0.4148F, -1.1786F, -0.1964F, 0.4408F));

		PartDefinition neck_r3 = Parmastega.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(45, 22).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 0.4148F, -1.3417F, -0.3747F, 1.0036F));

		PartDefinition neck_r4 = Parmastega.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(50, 9).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, -1.5852F, -1.3417F, -0.3747F, 1.0036F));

		PartDefinition neck_r5 = Parmastega.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, -1.5852F, -1.1786F, -0.1964F, 0.4408F));

		PartDefinition neck_r6 = Parmastega.addOrReplaceChild("neck_r6", CubeListBuilder.create().texOffs(45, 22).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 0.4148F, -1.3417F, 0.3747F, -1.0036F));

		PartDefinition neck_r7 = Parmastega.addOrReplaceChild("neck_r7", CubeListBuilder.create().texOffs(40, 49).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 0.4148F, -1.1786F, 0.1964F, -0.4408F));

		PartDefinition neck_r8 = Parmastega.addOrReplaceChild("neck_r8", CubeListBuilder.create().texOffs(50, 9).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, -1.5852F, -1.3417F, 0.3747F, -1.0036F));

		PartDefinition neck_r9 = Parmastega.addOrReplaceChild("neck_r9", CubeListBuilder.create().texOffs(0, 50).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, -1.5852F, -1.1786F, 0.1964F, -0.4408F));

		PartDefinition cube_r1 = Parmastega.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 22).addBox(0.0F, -0.9F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 28).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neck = Parmastega.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(35, 43).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -2.0F));

		PartDefinition Upperjaw = Head.addOrReplaceChild("Upperjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.7F, 0.2214F, -0.1704F, -0.0381F));

		PartDefinition cube_r2 = Upperjaw.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 41).addBox(-1.0F, -0.0227F, 0.0223F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -6.7F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Upperjaw.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 46).addBox(-1.0F, -0.0171F, -0.0548F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.7F, -5.7F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Upperjaw.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 11).addBox(-1.0F, -0.2F, -1.2F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Upperjaw.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -0.5F, -2.1F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -2.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Upperjaw.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(26, 0).mirror().addBox(-0.4F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.51F, -1.3F, -3.01F, -0.2182F, 0.0F, 0.2618F));

		PartDefinition cube_r7 = Upperjaw.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(26, 0).addBox(-0.6F, -1.5F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.51F, -1.3F, -3.01F, -0.2182F, 0.0F, -0.2618F));

		PartDefinition Snout = Upperjaw.addOrReplaceChild("Snout", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Snout.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 28).addBox(-3.0617F, -0.4306F, -1.8608F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5617F, 0.6094F, -8.0083F, 0.0151F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Snout.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(0.0097F, -0.6994F, -8.0462F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.3617F, 0.6094F, -0.3083F, 0.0358F, -0.2268F, 0.0F));

		PartDefinition cube_r10 = Snout.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(14, 0).addBox(-1.0097F, -0.6994F, -8.0462F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.3617F, 0.6094F, -0.3083F, 0.0358F, 0.2268F, 0.0F));

		PartDefinition cube_r11 = Snout.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(-1.647F, -0.3094F, -9.1721F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5617F, 0.6094F, -0.3083F, 0.0365F, -0.2965F, -0.0107F));

		PartDefinition cube_r12 = Snout.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.3913F, -0.3F, -1.9168F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5048F, 1.0157F, -6.4811F, 0.0357F, -0.2093F, -0.0074F));

		PartDefinition cube_r13 = Snout.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 31).addBox(0.3913F, -0.3F, -1.9168F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5048F, 1.0157F, -6.4811F, 0.0357F, 0.2093F, 0.0074F));

		PartDefinition cube_r14 = Snout.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(24, 18).addBox(1.647F, -0.3094F, -9.1721F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5617F, 0.6094F, -0.3083F, 0.0365F, 0.2965F, 0.0107F));

		PartDefinition cube_r15 = Snout.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 17).addBox(-2.5F, -0.9F, -2.7F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(35, 28).addBox(-1.5F, -0.9F, -6.7F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F))
				.texOffs(0, 6).addBox(-1.0F, -0.9F, -7.7F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.1F, -0.3F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Jawwhole = Upperjaw.addOrReplaceChild("Jawwhole", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, 0.3F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Jaw = Jawwhole.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(21, 41).addBox(1.7F, -0.02F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F))
				.texOffs(26, 49).addBox(1.7F, 0.58F, -3.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.8F, 0.1F, 0.4F, 0.1635F, 0.2259F, 0.0F));

		PartDefinition cube_r16 = Jaw.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 50).addBox(0.0F, -0.7F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.661F, -0.2131F, -8.6651F, -0.3094F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Jaw.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(14, 0).addBox(-0.039F, -0.5F, -3.534F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(39, 43).addBox(-0.989F, -0.22F, -3.534F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7F, 0.2F, -4.15F, -0.0912F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Jaw.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 48).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.4752F, -0.4312F, -9.9198F, -0.1071F, -0.2212F, 0.0445F));

		PartDefinition cube_r19 = Jaw.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(33, 49).addBox(-0.9565F, -0.941F, -1.8424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7F, 0.6F, -7.85F, -0.3426F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Jaw.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 22).addBox(-0.9565F, -0.941F, 0.0576F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.7F, 0.6F, -7.85F, -0.2369F, 0.0F, 0.0F));

		PartDefinition Jaw2 = Jawwhole.addOrReplaceChild("Jaw2", CubeListBuilder.create().texOffs(21, 41).mirror().addBox(-2.7F, -0.02F, -3.95F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(26, 49).mirror().addBox(-2.7F, 0.58F, -3.95F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.1F, 0.4F, 0.1635F, -0.2259F, 0.0F));

		PartDefinition cube_r21 = Jaw2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(5, 50).mirror().addBox(0.0F, -0.7F, -1.1F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.661F, -0.2131F, -8.6651F, -0.3094F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Jaw2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 0).mirror().addBox(0.039F, -0.5F, -3.534F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(39, 43).mirror().addBox(-0.011F, -0.22F, -3.534F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.2F, -4.15F, -0.0912F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Jaw2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(33, 49).mirror().addBox(-0.0435F, -0.941F, -1.8424F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.6F, -7.85F, -0.3426F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Jaw2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 22).mirror().addBox(-0.0435F, -0.941F, 0.0576F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.6F, -7.85F, -0.2369F, 0.0F, 0.0F));

		PartDefinition LArm = Parmastega.addOrReplaceChild("LArm", CubeListBuilder.create().texOffs(47, 17).addBox(0.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.5F, -0.5F, 0.6831F, -0.6593F, 0.2503F));

		PartDefinition LArm2 = LArm.addOrReplaceChild("LArm2", CubeListBuilder.create().texOffs(44, 14).addBox(0.0F, -0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(43, 6).addBox(0.0F, -0.5F, 0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(10, 13).addBox(3.0F, 0.0F, -1.3F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.5F, 0.0692F, 0.2527F, 0.2706F));

		PartDefinition LArm3 = Parmastega.addOrReplaceChild("LArm3", CubeListBuilder.create().texOffs(47, 17).mirror().addBox(-3.0F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 2.5F, -0.5F, 0.6831F, 0.6593F, -0.2503F));

		PartDefinition LArm4 = LArm3.addOrReplaceChild("LArm4", CubeListBuilder.create().texOffs(44, 14).mirror().addBox(-4.0F, -0.5F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(43, 6).mirror().addBox(-4.0F, -0.5F, 0.3F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(10, 13).mirror().addBox(-7.0F, 0.0F, -1.3F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.5F, 0.0465F, -0.2577F, -0.1806F));

		PartDefinition Body = Parmastega.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.03F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.044F, 0.1308F, -0.0057F));

		PartDefinition neck_r10 = Body.addOrReplaceChild("neck_r10", CubeListBuilder.create().texOffs(7, 0).mirror().addBox(-0.4132F, -0.7891F, 0.754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 9.1148F, -1.4933F, -0.0403F, 0.4784F));

		PartDefinition neck_r11 = Body.addOrReplaceChild("neck_r11", CubeListBuilder.create().texOffs(37, 36).mirror().addBox(0.0582F, -0.7891F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 9.1148F, -1.5271F, -0.0756F, 1.0455F));

		PartDefinition neck_r12 = Body.addOrReplaceChild("neck_r12", CubeListBuilder.create().texOffs(8, 6).mirror().addBox(-0.4132F, -0.7891F, 0.754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 7.1148F, -1.4933F, -0.0403F, 0.6093F));

		PartDefinition neck_r13 = Body.addOrReplaceChild("neck_r13", CubeListBuilder.create().texOffs(38, 9).mirror().addBox(0.0582F, -0.7891F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 7.1148F, -1.5271F, -0.0756F, 1.1764F));

		PartDefinition neck_r14 = Body.addOrReplaceChild("neck_r14", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-0.4132F, -0.7891F, 0.754F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 5.1148F, -1.4933F, -0.0403F, 0.6529F));

		PartDefinition neck_r15 = Body.addOrReplaceChild("neck_r15", CubeListBuilder.create().texOffs(0, 39).mirror().addBox(0.0582F, -0.7891F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 5.1148F, -1.5271F, -0.0756F, 1.2201F));

		PartDefinition neck_r16 = Body.addOrReplaceChild("neck_r16", CubeListBuilder.create().texOffs(46, 40).mirror().addBox(-0.4072F, -0.7877F, 0.7655F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 3.1148F, -1.4545F, -0.0603F, 0.6946F));

		PartDefinition neck_r17 = Body.addOrReplaceChild("neck_r17", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(0.0695F, -0.7877F, -0.136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 3.1148F, -1.5051F, -0.1133F, 1.2616F));

		PartDefinition neck_r18 = Body.addOrReplaceChild("neck_r18", CubeListBuilder.create().texOffs(47, 46).mirror().addBox(-0.3894F, -0.7801F, 0.7997F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 1.1148F, -1.3375F, -0.1198F, 0.6841F));

		PartDefinition neck_r19 = Body.addOrReplaceChild("neck_r19", CubeListBuilder.create().texOffs(28, 41).mirror().addBox(0.1028F, -0.7801F, -0.1168F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, 1.1148F, -1.4376F, -0.2261F, 1.2502F));

		PartDefinition neck_r20 = Body.addOrReplaceChild("neck_r20", CubeListBuilder.create().texOffs(7, 31).mirror().addBox(-0.3826F, -0.7764F, 0.8103F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, -0.8852F, -1.3375F, -0.1198F, 0.5532F));

		PartDefinition neck_r21 = Body.addOrReplaceChild("neck_r21", CubeListBuilder.create().texOffs(44, 34).mirror().addBox(0.1142F, -0.7764F, -0.1115F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.6353F, -0.8852F, -1.4376F, -0.2261F, 1.1193F));

		PartDefinition neck_r22 = Body.addOrReplaceChild("neck_r22", CubeListBuilder.create().texOffs(7, 0).addBox(0.4132F, -0.7891F, 0.754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 9.1148F, -1.4933F, 0.0403F, -0.4784F));

		PartDefinition neck_r23 = Body.addOrReplaceChild("neck_r23", CubeListBuilder.create().texOffs(37, 36).addBox(-0.0582F, -0.7891F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 9.1148F, -1.5271F, 0.0756F, -1.0455F));

		PartDefinition neck_r24 = Body.addOrReplaceChild("neck_r24", CubeListBuilder.create().texOffs(8, 6).addBox(0.4132F, -0.7891F, 0.754F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 7.1148F, -1.4933F, 0.0403F, -0.6093F));

		PartDefinition neck_r25 = Body.addOrReplaceChild("neck_r25", CubeListBuilder.create().texOffs(38, 9).addBox(-0.0582F, -0.7891F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 7.1148F, -1.5271F, 0.0756F, -1.1764F));

		PartDefinition neck_r26 = Body.addOrReplaceChild("neck_r26", CubeListBuilder.create().texOffs(0, 31).addBox(0.4132F, -0.7891F, 0.754F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 5.1148F, -1.4933F, 0.0403F, -0.6529F));

		PartDefinition neck_r27 = Body.addOrReplaceChild("neck_r27", CubeListBuilder.create().texOffs(0, 39).addBox(-0.0582F, -0.7891F, -0.1425F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 5.1148F, -1.5271F, 0.0756F, -1.2201F));

		PartDefinition cube_r25 = Body.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 0).addBox(0.0F, -3.1365F, 13.2481F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 17).addBox(0.0F, -2.7892F, 11.2785F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 17).addBox(0.0F, -2.4419F, 9.3088F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(0.0F, -2.0946F, 7.3392F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 13).addBox(0.0F, -1.7473F, 5.3696F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 17).addBox(0.0F, -1.4F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -4.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck_r28 = Body.addOrReplaceChild("neck_r28", CubeListBuilder.create().texOffs(46, 40).addBox(0.4072F, -0.7877F, 0.7655F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 3.1148F, -1.4545F, 0.0603F, -0.6946F));

		PartDefinition neck_r29 = Body.addOrReplaceChild("neck_r29", CubeListBuilder.create().texOffs(9, 39).addBox(-0.0695F, -0.7877F, -0.136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 3.1148F, -1.5051F, 0.1133F, -1.2616F));

		PartDefinition neck_r30 = Body.addOrReplaceChild("neck_r30", CubeListBuilder.create().texOffs(7, 31).addBox(0.3826F, -0.7764F, 0.8103F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, -0.8852F, -1.3375F, 0.1198F, -0.5532F));

		PartDefinition neck_r31 = Body.addOrReplaceChild("neck_r31", CubeListBuilder.create().texOffs(44, 34).addBox(-0.1142F, -0.7764F, -0.1115F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, -0.8852F, -1.4376F, 0.2261F, -1.1193F));

		PartDefinition neck_r32 = Body.addOrReplaceChild("neck_r32", CubeListBuilder.create().texOffs(28, 41).addBox(-0.1028F, -0.7801F, -0.1168F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 1.1148F, -1.4376F, 0.2261F, -1.2502F));

		PartDefinition neck_r33 = Body.addOrReplaceChild("neck_r33", CubeListBuilder.create().texOffs(47, 46).addBox(0.3894F, -0.7801F, 0.7997F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.6353F, 1.1148F, -1.3375F, 0.1198F, -0.6841F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(26, 0).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.02F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.0443F, 0.1744F, -0.0077F));

		PartDefinition cube_r26 = Body2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(50, 34).addBox(0.0F, -4.0566F, 19.1878F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 40).addBox(0.0F, -3.7214F, 17.2136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 13).addBox(0.0F, -3.4838F, 15.2177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tailbase_r1 = Body2.addOrReplaceChild("tailbase_r1", CubeListBuilder.create().texOffs(28, 43).mirror().addBox(-2.9283F, 2.9239F, -0.7506F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.7637F, 3.6675F, 0.0164F, 0.006F, -0.349F));

		PartDefinition tailbase_r2 = Body2.addOrReplaceChild("tailbase_r2", CubeListBuilder.create().texOffs(19, 47).mirror().addBox(-0.5F, 0.2335F, -0.9372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.5449F, 4.9816F, -0.5854F, -0.0284F, -0.4039F));

		PartDefinition tailbase_r3 = Body2.addOrReplaceChild("tailbase_r3", CubeListBuilder.create().texOffs(10, 17).mirror().addBox(-2.4F, -1.795F, -0.7192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 17).addBox(1.4F, -1.795F, -0.7192F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7637F, 3.6675F, -1.8151F, 0.0F, 0.0F));

		PartDefinition tailbase_r4 = Body2.addOrReplaceChild("tailbase_r4", CubeListBuilder.create().texOffs(19, 47).addBox(-0.5F, 0.2335F, -0.9372F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.5449F, 4.9816F, -0.5854F, 0.0284F, 0.4039F));

		PartDefinition tailbase_r5 = Body2.addOrReplaceChild("tailbase_r5", CubeListBuilder.create().texOffs(28, 43).addBox(1.9283F, 2.9239F, -0.7506F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7637F, 3.6675F, 0.0164F, -0.006F, 0.349F));

		PartDefinition tailbase_r6 = Body2.addOrReplaceChild("tailbase_r6", CubeListBuilder.create().texOffs(36, 0).addBox(-1.6F, 3.7048F, -0.7506F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(0.0F, -0.7637F, 3.6675F, 0.0175F, 0.0F, 0.0F));

		PartDefinition neck_r34 = Body2.addOrReplaceChild("neck_r34", CubeListBuilder.create().texOffs(36, 0).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.5353F, 3.4148F, -1.5708F, 0.0F, 1.0472F));

		PartDefinition neck_r35 = Body2.addOrReplaceChild("neck_r35", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.5353F, 1.4148F, -1.4933F, -0.0403F, 0.4784F));

		PartDefinition neck_r36 = Body2.addOrReplaceChild("neck_r36", CubeListBuilder.create().texOffs(26, 36).mirror().addBox(0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.55F, -0.5353F, 1.4148F, -1.5271F, -0.0756F, 1.0455F));

		PartDefinition neck_r37 = Body2.addOrReplaceChild("neck_r37", CubeListBuilder.create().texOffs(36, 0).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.5353F, 3.4148F, -1.5708F, 0.0F, -1.0472F));

		PartDefinition neck_r38 = Body2.addOrReplaceChild("neck_r38", CubeListBuilder.create().texOffs(0, 6).addBox(0.4253F, -0.4903F, 0.7308F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.5353F, 1.4148F, -1.4933F, 0.0403F, -0.4784F));

		PartDefinition neck_r39 = Body2.addOrReplaceChild("neck_r39", CubeListBuilder.create().texOffs(26, 36).addBox(-0.0356F, -0.4903F, -0.1556F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.55F, -0.5353F, 1.4148F, -1.5271F, 0.0756F, -1.0455F));

		PartDefinition LLeg = Body2.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(47, 0).addBox(0.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.0F, 5.0F, -0.3224F, -0.9464F, 1.612F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(46, 28).addBox(0.0F, -0.5F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F))
				.texOffs(14, 6).addBox(0.0F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 22).addBox(2.0F, 0.0F, -1.5F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, -0.0411F, -0.3027F, 0.1372F));

		PartDefinition LLeg3 = Body2.addOrReplaceChild("LLeg3", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(-3.0F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.0F, 5.0F, 0.6013F, 0.5805F, -0.4957F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(46, 28).mirror().addBox(-3.0F, -0.5F, -1.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(14, 6).mirror().addBox(-3.0F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(33, 22).mirror().addBox(-6.0F, 0.0F, -1.5F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, -0.0681F, 0.298F, -0.2284F));

		PartDefinition Tail = Body2.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 7.2F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r27 = Tail.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -5.2978F, 25.2359F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(45, 50).addBox(0.0F, -4.4429F, 23.1795F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 31).addBox(0.0F, -4.2926F, 21.1751F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6527F, -21.7163F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Tail.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 36).addBox(-0.5F, -0.4F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1527F, -0.3163F, -0.0698F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(29, 9).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.02F))
				.texOffs(13, 26).addBox(0.0F, -4.0F, 0.0F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3473F, 4.7837F, 0.0F, -0.2182F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(8, 41).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(19, 11).addBox(-0.01F, -4.0F, -0.8F, 0.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.8F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(0, 13).addBox(0.0F, -4.0F, -1.7F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(26, 28).addBox(-0.5F, -0.5F, 0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, 0.0F, -0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 57, 57);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}