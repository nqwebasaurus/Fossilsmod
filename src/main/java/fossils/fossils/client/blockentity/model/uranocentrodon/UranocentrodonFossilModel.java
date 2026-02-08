package fossils.fossils.client.blockentity.model.uranocentrodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class UranocentrodonFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart forelegL;
	private final ModelPart forelegL2;
	private final ModelPart bone;
	private final ModelPart forelegL3;
	private final ModelPart forelegL4;
	private final ModelPart bone5;
	private final ModelPart bone2;
	private final ModelPart bone7;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Tailbase;
	private final ModelPart Tailmiddlebase;
	private final ModelPart Tailmiddle;
	private final ModelPart Tailmiddleend;
	private final ModelPart Tailend;
	private final ModelPart hindlegL;
	private final ModelPart hindlegL2;
	private final ModelPart bone4;
	private final ModelPart hindlegL3;
	private final ModelPart hindlegL4;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone8;

	public UranocentrodonFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.forelegL = this.chest.getChild("forelegL");
		this.forelegL2 = this.forelegL.getChild("forelegL2");
		this.bone = this.forelegL2.getChild("bone");
		this.forelegL3 = this.chest.getChild("forelegL3");
		this.forelegL4 = this.forelegL3.getChild("forelegL4");
		this.bone5 = this.forelegL4.getChild("bone5");
		this.bone2 = this.chest.getChild("bone2");
		this.bone7 = this.chest.getChild("bone7");
		this.Neck = this.chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.jaw = this.Head.getChild("jaw");
		this.Tailbase = this.Hips.getChild("Tailbase");
		this.Tailmiddlebase = this.Tailbase.getChild("Tailmiddlebase");
		this.Tailmiddle = this.Tailmiddlebase.getChild("Tailmiddle");
		this.Tailmiddleend = this.Tailmiddle.getChild("Tailmiddleend");
		this.Tailend = this.Tailmiddleend.getChild("Tailend");
		this.hindlegL = this.Hips.getChild("hindlegL");
		this.hindlegL2 = this.hindlegL.getChild("hindlegL2");
		this.bone4 = this.hindlegL2.getChild("bone4");
		this.hindlegL3 = this.Hips.getChild("hindlegL3");
		this.hindlegL4 = this.hindlegL3.getChild("hindlegL4");
		this.bone6 = this.hindlegL4.getChild("bone6");
		this.bone3 = this.Hips.getChild("bone3");
		this.bone8 = this.Hips.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-1.0F, -3.8F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(57, 0).addBox(0.9206F, -0.7028F, -3.4109F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(9, 62).addBox(1.9F, -0.1957F, -2.495F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 62).mirror().addBox(-1.0589F, -0.1957F, -2.495F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4206F, -2.3241F, 17.6163F, -0.1439F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(95, 78).addBox(1.4206F, -1.125F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.4028F, -0.4109F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(95, 75).addBox(1.4206F, -1.2F, 0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3528F, -2.5109F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(39, 56).addBox(0.9206F, -0.391F, -4.0999F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2885F, -3.3114F, 0.045F, -0.0872F, -0.0039F));

		PartDefinition Bodymiddle_r1 = Bodymiddle.addOrReplaceChild("Bodymiddle_r1", CubeListBuilder.create().texOffs(8, 95).addBox(1.4206F, -0.8121F, 0.1228F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.316F, -1.1999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Bodymiddle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 93).mirror().addBox(-3.9594F, -1.6483F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, 0.0106F, -2.6602F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r2 = Bodymiddle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(91, 31).mirror().addBox(-3.3787F, -0.2431F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, 0.0106F, -2.6602F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r3 = Bodymiddle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 93).addBox(2.9594F, -1.6483F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -2.6602F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r4 = Bodymiddle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(91, 31).addBox(2.3787F, -0.2431F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0106F, -2.6602F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition Bodymiddle_r2 = Bodymiddle.addOrReplaceChild("Bodymiddle_r2", CubeListBuilder.create().texOffs(90, 94).addBox(1.4206F, -0.7551F, -0.0864F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.391F, -2.9999F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(38, 62).addBox(0.9206F, -0.4F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.009F, -4.0999F, 0.0877F, 0.0F, 0.0F));

		PartDefinition Bodymiddle_r3 = body.addOrReplaceChild("Bodymiddle_r3", CubeListBuilder.create().texOffs(11, 95).addBox(1.4206F, -0.7016F, 0.0359F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -1.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-4.9594F, -1.6483F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, 0.0016F, -0.5604F, 0.3649F, 0.2448F, -0.5655F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(93, 73).mirror().addBox(-3.3787F, -0.2431F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, 0.0016F, -0.5604F, 0.4305F, 0.0735F, -0.1585F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(93, 71).mirror().addBox(-3.3787F, -0.2431F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, -0.1984F, -2.6604F, 0.6037F, 0.0998F, -0.1434F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 68).mirror().addBox(-4.9594F, -1.6482F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, -0.1984F, -2.6604F, 0.5208F, 0.3352F, -0.5208F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(81, 33).mirror().addBox(-5.1899F, -4.1397F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3411F, -0.1984F, -2.6604F, 0.2459F, 0.5651F, -1.1326F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(82, 70).addBox(2.9594F, -1.6483F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -0.5604F, 0.3649F, -0.2448F, 0.5655F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(93, 73).addBox(2.3787F, -0.2431F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0016F, -0.5604F, 0.4305F, -0.0735F, 0.1585F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(93, 71).addBox(2.3787F, -0.2431F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1984F, -2.6604F, 0.6037F, -0.0998F, 0.1434F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(82, 68).addBox(2.9594F, -1.6482F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1984F, -2.6604F, 0.5208F, -0.3352F, 0.5208F));

		PartDefinition cube_r14 = body.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(81, 33).addBox(3.1899F, -4.1397F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1984F, -2.6604F, 0.2459F, -0.5651F, 1.1326F));

		PartDefinition Bodymiddle_r4 = body.addOrReplaceChild("Bodymiddle_r4", CubeListBuilder.create().texOffs(96, 19).addBox(1.4206F, -0.7516F, 0.0359F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create().texOffs(56, 42).addBox(1.0206F, -0.4874F, -4.0045F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(20, 95).addBox(1.5206F, -1.2624F, -2.0045F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.0869F, 0.0846F, -2.8505F, -0.0149F, 0.0873F, -0.0013F));

		PartDefinition cube_r15 = Bodyfront.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(93, 83).mirror().addBox(-2.3896F, -0.1008F, -0.5267F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4411F, -0.2984F, -1.5604F, 0.5469F, 0.0815F, -0.1715F));

		PartDefinition cube_r16 = Bodyfront.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(83, 35).mirror().addBox(-4.1231F, -1.1013F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4411F, -0.2984F, -1.5604F, 0.4727F, 0.2972F, -0.5586F));

		PartDefinition cube_r17 = Bodyfront.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(70, 19).mirror().addBox(-5.8024F, -3.2186F, -0.5267F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4411F, -0.2984F, -1.5604F, 0.2275F, 0.5078F, -1.1649F));

		PartDefinition cube_r18 = Bodyfront.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(93, 81).mirror().addBox(-2.4107F, -0.1295F, -0.7132F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4411F, -0.1984F, -3.5604F, 0.5372F, 0.0567F, -0.1264F));

		PartDefinition cube_r19 = Bodyfront.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-4.1301F, -1.1362F, -0.7132F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4411F, -0.1984F, -3.5604F, 0.4731F, 0.2706F, -0.5128F));

		PartDefinition cube_r20 = Bodyfront.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 29).mirror().addBox(-6.7887F, -3.2515F, -0.7132F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4411F, -0.1984F, -3.5604F, 0.2451F, 0.486F, -1.1107F));

		PartDefinition cube_r21 = Bodyfront.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(93, 83).addBox(1.3896F, -0.1008F, -0.5267F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2984F, -1.5604F, 0.5469F, -0.0815F, 0.1715F));

		PartDefinition cube_r22 = Bodyfront.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(83, 35).addBox(2.1231F, -1.1013F, -0.5267F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2984F, -1.5604F, 0.4727F, -0.2972F, 0.5586F));

		PartDefinition cube_r23 = Bodyfront.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(70, 19).addBox(2.8023F, -3.2186F, -0.5267F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2984F, -1.5604F, 0.2275F, -0.5078F, 1.1649F));

		PartDefinition cube_r24 = Bodyfront.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(93, 81).addBox(1.4107F, -0.1295F, -0.7132F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1984F, -3.5604F, 0.5372F, -0.0567F, 0.1264F));

		PartDefinition cube_r25 = Bodyfront.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 83).addBox(2.1301F, -1.1362F, -0.7132F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1984F, -3.5604F, 0.4731F, -0.2706F, 0.5128F));

		PartDefinition cube_r26 = Bodyfront.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(40, 29).addBox(2.7887F, -3.2515F, -0.7132F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.1984F, -3.5604F, 0.2451F, -0.486F, 1.1107F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(17, 95).addBox(1.4206F, -1.2F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.0874F, -4.0045F, -0.0087F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(52, 29).addBox(0.9206F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(23, 95).addBox(1.4206F, -1.5F, -3.975F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, 0.1225F, -4.0048F, 0.0354F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = body2.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(30, 95).addBox(1.4206F, -1.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -1.975F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-6.9411F, -3.1772F, -0.7485F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3411F, -0.3209F, -1.5556F, 0.1473F, 0.4024F, -1.0958F));

		PartDefinition cube_r28 = body2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(-4.215F, -0.9894F, -0.7485F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3411F, -0.3209F, -1.5556F, 0.3487F, 0.2518F, -0.4879F));

		PartDefinition cube_r29 = body2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(93, 93).mirror().addBox(-2.4256F, 0.0394F, -0.7485F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3411F, -0.3209F, -1.5556F, 0.4189F, 0.086F, -0.0778F));

		PartDefinition cube_r30 = body2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-2.4345F, 0.1056F, -0.7232F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3411F, -0.3209F, -3.5556F, 0.4663F, 0.0488F, -0.0455F));

		PartDefinition cube_r31 = body2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(83, 37).mirror().addBox(-4.251F, -0.9331F, -0.7232F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3411F, -0.3209F, -3.5556F, 0.4087F, 0.2361F, -0.4443F));

		PartDefinition cube_r32 = body2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 6).mirror().addBox(-7.0025F, -3.1507F, -0.7232F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3411F, -0.3209F, -3.5556F, 0.2093F, 0.4225F, -1.0418F));

		PartDefinition cube_r33 = body2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(67, 43).addBox(2.9411F, -3.1772F, -0.7485F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -1.5556F, 0.1473F, -0.4024F, 1.0958F));

		PartDefinition cube_r34 = body2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(83, 39).addBox(2.215F, -0.9894F, -0.7485F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -1.5556F, 0.3487F, -0.2518F, 0.4879F));

		PartDefinition cube_r35 = body2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 93).addBox(1.4256F, 0.0394F, -0.7485F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -1.5556F, 0.4189F, -0.086F, 0.0778F));

		PartDefinition cube_r36 = body2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(93, 91).addBox(1.4345F, 0.1056F, -0.7232F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -3.5556F, 0.4663F, -0.0488F, 0.0455F));

		PartDefinition cube_r37 = body2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 37).addBox(2.251F, -0.9331F, -0.7232F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -3.5556F, 0.4087F, -0.2361F, 0.4443F));

		PartDefinition cube_r38 = body2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 6).addBox(3.0025F, -3.1507F, -0.7232F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -3.5556F, 0.2093F, -0.4225F, 1.0418F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(55, 8).addBox(0.9285F, -0.6F, -4.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.008F, -0.003F, -4.9275F, -0.0087F, 0.0873F, -0.0008F));

		PartDefinition Bodyfront_r3 = body3.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(0, 96).addBox(1.4285F, -1.4F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0953F, 0.0232F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r4 = body3.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(96, 16).addBox(1.4285F, -1.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.975F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body3.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(93, 95).addBox(1.4285F, -1.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2F, -4.975F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(79, 94).mirror().addBox(-2.433F, 0.0825F, -0.7713F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4571F, -0.3209F, -0.5556F, 0.4595F, 0.0748F, -0.0427F));

		PartDefinition cube_r40 = body3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(84, 25).mirror().addBox(-4.2399F, -0.9535F, -0.7713F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4571F, -0.3209F, -0.5556F, 0.3918F, 0.2575F, -0.4452F));

		PartDefinition cube_r41 = body3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(68, 8).mirror().addBox(-6.9818F, -3.1614F, -0.7713F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4571F, -0.3209F, -0.5556F, 0.1812F, 0.4308F, -1.0502F));

		PartDefinition cube_r42 = body3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(68, 6).mirror().addBox(-6.8687F, -3.2248F, -0.7195F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, -0.2209F, -2.5556F, 0.1239F, 0.3922F, -1.0271F));

		PartDefinition cube_r43 = body3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(84, 23).mirror().addBox(-4.1816F, -1.0694F, -0.7195F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, -0.2209F, -2.5556F, 0.3244F, 0.2558F, -0.4163F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(94, 59).mirror().addBox(-2.4291F, -0.0472F, -0.7195F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, -0.2209F, -2.5556F, 0.3988F, 0.0991F, -0.002F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(94, 14).mirror().addBox(-2.4331F, 0.1831F, -0.8022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, -0.3209F, -4.4556F, 0.4362F, 0.0751F, 0.027F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(84, 21).mirror().addBox(-4.2826F, -0.8623F, -0.8022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, -0.3209F, -4.4556F, 0.3696F, 0.2486F, -0.3793F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(68, 4).mirror().addBox(-7.0682F, -3.1097F, -0.8022F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3571F, -0.3209F, -4.4556F, 0.1673F, 0.4113F, -0.9844F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(79, 94).addBox(1.433F, 0.0825F, -0.7713F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3209F, -0.5556F, 0.4595F, -0.0748F, 0.0427F));

		PartDefinition cube_r49 = body3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(84, 25).addBox(2.2399F, -0.9535F, -0.7713F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3209F, -0.5556F, 0.3918F, -0.2575F, 0.4452F));

		PartDefinition cube_r50 = body3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(68, 8).addBox(2.9818F, -3.1614F, -0.7713F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.3209F, -0.5556F, 0.1812F, -0.4308F, 1.0502F));

		PartDefinition cube_r51 = body3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(68, 6).addBox(2.8687F, -3.2248F, -0.7195F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.1239F, -0.3922F, 1.0271F));

		PartDefinition cube_r52 = body3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(84, 23).addBox(2.1816F, -1.0694F, -0.7195F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3244F, -0.2558F, 0.4163F));

		PartDefinition cube_r53 = body3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 59).addBox(1.4291F, -0.0472F, -0.7195F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2209F, -2.5556F, 0.3988F, -0.0991F, 0.002F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(94, 14).addBox(1.4331F, 0.1831F, -0.8022F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -4.4556F, 0.4362F, -0.0751F, -0.027F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(84, 21).addBox(2.2826F, -0.8623F, -0.8022F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -4.4556F, 0.3696F, -0.2486F, 0.3793F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(68, 4).addBox(3.0682F, -3.1097F, -0.8022F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3209F, -4.4556F, 0.1673F, -0.4113F, 0.9844F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(40, 9).addBox(0.9165F, -0.4F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(33, 95).addBox(1.4165F, -1.2F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0208F, -0.2116F, -4.8537F, 0.0701F, 0.0871F, 0.0061F));

		PartDefinition Bodyfront_r6 = chest.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(27, 66).addBox(1.4165F, -1.35F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = chest.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(95, 33).addBox(1.4165F, -1.375F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.1F, -4.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(25, 9).addBox(-1.6F, -3.7855F, 0.1026F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(40, 17).addBox(-2.6F, -1.7882F, 0.1214F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.0784F, -6.8272F, 1.4486F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(19, 31).addBox(-2.6F, 1.8797F, -0.9256F, 8.0F, 4.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.9784F, -8.4272F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 78).addBox(0.9165F, -6.7032F, -0.0255F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 6.0784F, -6.8272F, 1.4137F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(83, 78).mirror().addBox(-4.6594F, -3.2747F, -0.7453F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4329F, -0.2209F, -5.3806F, 0.1535F, 0.5928F, -1.3296F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-4.0359F, -1.2277F, -0.7453F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4329F, -0.2209F, -5.3806F, 0.4712F, 0.4031F, -0.6851F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(94, 8).mirror().addBox(-2.364F, -0.2523F, -0.7453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4329F, -0.2209F, -5.3806F, 0.5861F, 0.18F, -0.2924F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(74, 83).mirror().addBox(-4.2212F, -0.9573F, -0.6831F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5329F, -0.2209F, -3.4806F, 0.365F, 0.2861F, -0.4786F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(94, 6).mirror().addBox(-2.4177F, 0.0711F, -0.6831F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5329F, -0.2209F, -3.4806F, 0.4471F, 0.1112F, -0.0701F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(59, 71).mirror().addBox(-5.9642F, -3.1541F, -0.6831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5329F, -0.2209F, -3.4806F, 0.1398F, 0.4394F, -1.0939F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-2.4131F, 0.0799F, -0.7216F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4329F, -0.1209F, -1.4806F, 0.4131F, 0.0959F, -0.0236F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-4.2208F, -0.9474F, -0.7216F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4329F, -0.1209F, -1.4806F, 0.3392F, 0.2586F, -0.4355F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(67, 45).mirror().addBox(-6.9694F, -3.1457F, -0.7216F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4329F, -0.1209F, -1.4806F, 0.1349F, 0.4027F, -1.0459F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(83, 78).addBox(2.6594F, -3.2747F, -0.7453F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -5.3806F, 0.1535F, -0.5928F, 1.3296F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(83, 76).addBox(2.0359F, -1.2277F, -0.7453F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -5.3806F, 0.4712F, -0.4031F, 0.6851F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(94, 8).addBox(1.364F, -0.2523F, -0.7453F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.2209F, -5.3806F, 0.5861F, -0.18F, 0.2924F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(59, 71).addBox(2.9642F, -3.1541F, -0.6831F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2209F, -3.4806F, 0.1398F, -0.4394F, 1.0939F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(74, 83).addBox(2.2212F, -0.9573F, -0.6831F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2209F, -3.4806F, 0.365F, -0.2861F, 0.4786F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(94, 6).addBox(1.4177F, 0.0711F, -0.6831F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, -0.2209F, -3.4806F, 0.4471F, -0.1112F, 0.0701F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 94).addBox(1.4131F, 0.0799F, -0.7216F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1209F, -1.4806F, 0.4131F, -0.0959F, 0.0236F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(83, 41).addBox(2.2208F, -0.9474F, -0.7216F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1209F, -1.4806F, 0.3392F, -0.2586F, 0.4355F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(67, 45).addBox(2.9694F, -3.1457F, -0.7216F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, -0.1209F, -1.4806F, 0.1349F, -0.4027F, 1.0459F));

		PartDefinition forelegL = chest.addOrReplaceChild("forelegL", CubeListBuilder.create().texOffs(54, 71).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.7503F, 3.7173F, -4.0563F, -0.6491F, 0.1964F, -1.1845F));

		PartDefinition cube_r78 = forelegL.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(53, 83).addBox(-0.5F, -3.075F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r79 = forelegL.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(25, 86).addBox(-0.5F, 1.45F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(86, 18).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r80 = forelegL.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 62).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL2 = forelegL.addOrReplaceChild("forelegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0372F, 4.2887F, 0.1457F, -1.0209F, 0.3117F, -0.107F));

		PartDefinition cube_r81 = forelegL2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(35, 86).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r82 = forelegL2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(86, 30).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(86, 27).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r83 = forelegL2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(83, 72).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r84 = forelegL2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(59, 77).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(13, 32).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone = forelegL2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3235F, 3.2362F, -0.249F, 0.0289F, 0.26F, -0.4256F));

		PartDefinition cube_r85 = bone.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(26, 37).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition forelegL3 = chest.addOrReplaceChild("forelegL3", CubeListBuilder.create().texOffs(54, 77).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-3.9173F, 3.7173F, -4.0563F, 0.7466F, 0.0248F, 1.0834F));

		PartDefinition cube_r86 = forelegL3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -3.075F, -0.975F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0884F, -0.5507F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r87 = forelegL3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(92, 0).addBox(-0.5F, 1.45F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F))
				.texOffs(88, 91).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 1.5903F, -0.6226F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r88 = forelegL3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 85).addBox(-0.5F, -0.675F, -0.025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition forelegL4 = forelegL3.addOrReplaceChild("forelegL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0372F, 4.2887F, 0.1457F, -1.7958F, -0.221F, 0.2147F));

		PartDefinition cube_r89 = forelegL4.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(17, 92).addBox(-0.5F, 0.0F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 2.1327F, 1.3354F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r90 = forelegL4.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(9, 92).addBox(-0.5F, -0.325F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(92, 3).addBox(-0.5F, -1.025F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r91 = forelegL4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(20, 85).addBox(-0.5F, -1.125F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.0765F, 0.5595F, 0.5769F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r92 = forelegL4.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(59, 82).addBox(-0.5F, -1.2F, 0.8F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.152F))
				.texOffs(69, 81).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0765F, 1.0362F, -0.649F, 0.2182F, 0.0F, 0.0F));

		PartDefinition bone5 = forelegL4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3235F, 3.2362F, -0.249F, 0.0056F, -0.2615F, 0.516F));

		PartDefinition cube_r93 = bone5.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(39, 31).addBox(-0.5F, -0.4F, -2.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 0.5F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 0.5083F, -4.232F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r94 = bone2.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(61, 60).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2758F, 1.7886F, 0.6438F, 1.8748F, -0.0965F, -0.2997F));

		PartDefinition cube_r95 = bone2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(31, 62).addBox(1.7506F, -0.1508F, -0.0148F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 5.9276F, 1.0003F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r96 = bone2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(61, 54).addBox(1.5283F, 0.0872F, -0.6054F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.4216F, 0.1459F, 0.1202F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(40, 21).addBox(-3.5641F, -3.5641F, -0.4036F, 6.0F, 6.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.0213F, 4.075F, 4.2222F, 2.0128F, -0.735F, -0.3073F));

		PartDefinition cube_r98 = bone2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(74, 28).addBox(2.5147F, -5.4258F, -1.5459F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.8894F, 0.9318F, 0.2766F));

		PartDefinition cube_r99 = bone2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(47, 62).addBox(-0.36F, -5.0397F, -1.5459F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 1.7865F, 0.51F, 0.1243F));

		PartDefinition cube_r100 = bone2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(0, 74).addBox(1.3617F, -0.8778F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F))
				.texOffs(43, 73).addBox(1.3617F, 0.1222F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.242F, 0.1725F, 0.1928F));

		PartDefinition cube_r101 = bone2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(59, 73).addBox(1.5649F, -0.1175F, -3.1196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.3241F, 0.3723F, 0.3312F));

		PartDefinition cube_r102 = bone2.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(26, 73).addBox(1.5283F, 0.2814F, 0.121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.2494F, 4.7778F, -0.7079F, 0.2435F, 0.1459F, 0.1202F));

		PartDefinition cube_r103 = bone2.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(36, 72).addBox(-0.5F, -0.775F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.5992F, 6.4019F, -4.1855F, 0.7605F, 0.3723F, 0.3312F));

		PartDefinition cube_r104 = bone2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(70, 54).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.5483F, 5.1859F, -2.8995F, 1.0223F, 0.3723F, 0.3312F));

		PartDefinition cube_r105 = bone2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 61).addBox(-0.5F, -1.45F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.2918F, 3.3344F, -1.4833F, 1.2623F, 0.1516F, 0.2096F));

		PartDefinition cube_r106 = bone2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(40, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.5F, 3.7695F, 4.2005F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r107 = bone2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(17, 89).addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.5F, 3.0984F, 2.8677F, 2.522F, 0.0F, 0.0F));

		PartDefinition cube_r108 = bone2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(68, 71).addBox(-0.5F, -0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.5F, 3.0984F, 2.8677F, -3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r109 = bone2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(65, 33).addBox(-0.5F, 0.9F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(70, 14).addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5F, 3.934F, 1.3309F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r110 = bone2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(64, 84).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6742F, 0.3112F, 2.0769F, 0.9236F, -0.0965F, -0.2997F));

		PartDefinition cube_r111 = bone2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(84, 58).addBox(-0.5F, 0.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(84, 54).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1238F, -1.8442F, 0.9361F, -0.1673F, -0.0965F, -0.2997F));

		PartDefinition cube_r112 = bone2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(19, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.4581F, -1.391F, -0.9829F, 0.2691F, -0.0965F, -0.2997F));

		PartDefinition cube_r113 = bone2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(38, 81).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.733F, -0.7305F, -1.6816F, 0.7927F, -0.0965F, -0.2997F));

		PartDefinition cube_r114 = bone2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(81, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0411F, 0.1441F, -2.0558F, 1.1854F, -0.0965F, -0.2997F));

		PartDefinition cube_r115 = bone2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(47, 67).addBox(-0.9251F, -0.2185F, -0.1601F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.0F, 1.7848F, -2.1053F, 1.4035F, -0.0965F, -0.2997F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5671F, 0.5083F, -4.232F, -0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r116 = bone7.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(61, 60).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2758F, 1.7886F, 0.6438F, 1.8748F, 0.0965F, 0.2997F));

		PartDefinition cube_r117 = bone7.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(31, 62).mirror().addBox(-2.7506F, -0.1508F, -0.0148F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 5.9276F, 1.0003F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r118 = bone7.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(61, 54).mirror().addBox(-2.5283F, 0.0872F, -0.6054F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.4216F, -0.1459F, -0.1202F));

		PartDefinition cube_r119 = bone7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(74, 28).mirror().addBox(-4.5147F, -5.4258F, -1.5459F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.8894F, -0.9318F, -0.2766F));

		PartDefinition cube_r120 = bone7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(47, 62).mirror().addBox(-2.64F, -5.0397F, -1.5459F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 1.7865F, -0.51F, -0.1243F));

		PartDefinition cube_r121 = bone7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-2.3617F, -0.8778F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(43, 73).mirror().addBox(-2.3617F, 0.1222F, -1.7512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.242F, -0.1725F, -0.1928F));

		PartDefinition cube_r122 = bone7.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(59, 73).mirror().addBox(-2.5649F, -0.1175F, -3.1196F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.3241F, -0.3723F, -0.3312F));

		PartDefinition cube_r123 = bone7.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(26, 73).mirror().addBox(-2.5283F, 0.2814F, 0.121F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.2494F, 4.7778F, -0.7079F, 0.2435F, -0.1459F, -0.1202F));

		PartDefinition cube_r124 = bone7.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(36, 72).mirror().addBox(-0.5F, -0.775F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.5992F, 6.4019F, -4.1855F, 0.7605F, -0.3723F, -0.3312F));

		PartDefinition cube_r125 = bone7.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(70, 54).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5483F, 5.1859F, -2.8995F, 1.0223F, -0.3723F, -0.3312F));

		PartDefinition cube_r126 = bone7.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-0.5F, -1.45F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.2918F, 3.3344F, -1.4833F, 1.2623F, -0.1516F, -0.2096F));

		PartDefinition cube_r127 = bone7.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(40, 86).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.7695F, 4.2005F, -1.7977F, 0.0F, 0.0F));

		PartDefinition cube_r128 = bone7.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(17, 89).mirror().addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.0984F, 2.8677F, 2.522F, 0.0F, 0.0F));

		PartDefinition cube_r129 = bone7.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(68, 71).mirror().addBox(-0.5F, -0.5F, -0.825F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.0984F, 2.8677F, -3.0631F, 0.0F, 0.0F));

		PartDefinition cube_r130 = bone7.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-0.5F, 0.9F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(70, 14).mirror().addBox(-0.5F, -0.1F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 3.934F, 1.3309F, 2.9147F, 0.0F, 0.0F));

		PartDefinition cube_r131 = bone7.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(64, 84).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6742F, 0.3112F, 2.0769F, 0.9236F, 0.0965F, 0.2997F));

		PartDefinition cube_r132 = bone7.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(84, 58).mirror().addBox(-0.5F, 0.0F, 0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(84, 54).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1238F, -1.8442F, 0.9361F, -0.1673F, 0.0965F, 0.2997F));

		PartDefinition cube_r133 = bone7.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(19, 71).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.4581F, -1.391F, -0.9829F, 0.2691F, 0.0965F, 0.2997F));

		PartDefinition cube_r134 = bone7.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(38, 81).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.733F, -0.7305F, -1.6816F, 0.7927F, 0.0965F, 0.2997F));

		PartDefinition cube_r135 = bone7.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(81, 28).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0411F, 0.1441F, -2.0558F, 1.1854F, 0.0965F, 0.2997F));

		PartDefinition cube_r136 = bone7.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(47, 67).mirror().addBox(-0.0749F, -0.2185F, -0.1601F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.7848F, -2.1053F, 1.4035F, 0.0965F, 0.2997F));

		PartDefinition Neck = chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(50, 56).addBox(0.9165F, -0.7596F, -3.9227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3424F, -6.0009F, -0.2072F, 0.1305F, -0.0099F));

		PartDefinition Neck_r1 = Neck.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(95, 36).addBox(1.4165F, -0.6743F, -0.0076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -3.9227F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Neck_r2 = Neck.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(36, 95).addBox(1.4165F, -0.775F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6596F, -1.9227F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r137 = Neck.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-2.8124F, -1.0762F, -0.6479F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3329F, -0.0633F, -3.1797F, 0.5013F, 0.5327F, -0.7043F));

		PartDefinition cube_r138 = Neck.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(83, 80).mirror().addBox(-2.9618F, -0.9246F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3329F, -0.0633F, -1.1797F, 0.5976F, 0.4183F, -0.5824F));

		PartDefinition cube_r139 = Neck.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(-3.9384F, -2.4228F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3329F, -0.0633F, -1.1797F, 0.2576F, 0.6742F, -1.2156F));

		PartDefinition cube_r140 = Neck.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(84, 0).addBox(0.8124F, -1.0762F, -0.6479F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -3.1797F, 0.5013F, -0.5327F, 0.7043F));

		PartDefinition cube_r141 = Neck.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(81, 83).addBox(1.9384F, -2.4228F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -1.1797F, 0.2576F, -0.6742F, 1.2156F));

		PartDefinition cube_r142 = Neck.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(83, 80).addBox(0.9618F, -0.9246F, -0.5678F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0633F, -1.1797F, 0.5976F, -0.4183F, 0.5824F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(1.49F, -0.0838F, -3.8741F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(27, 69).addBox(-2.2234F, -0.2196F, -1.0051F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.6499F, -2.2849F, -2.4306F, -0.0524F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(89, 88).addBox(-1.2234F, -2.3842F, -10.9041F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -2.2849F, -2.4306F, 0.2448F, -0.0063F, -0.0003F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(89, 85).addBox(-1.2234F, -1.3337F, -10.1889F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6499F, -2.2849F, -2.4306F, 0.1401F, -0.0063F, -0.0003F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(9, 66).addBox(-1.2234F, -0.1149F, -9.3585F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -2.2849F, -2.4306F, 0.0092F, -0.0063F, -0.0002F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(13, 56).addBox(-1.7234F, -0.1778F, -6.9774F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -2.2849F, -2.4306F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(20, 62).addBox(-2.2234F, -0.3251F, -2.9657F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6499F, -2.2849F, -2.4306F, 0.0698F, 0.0F, 0.0F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(45, 86).addBox(-1.3959F, -0.325F, -0.0387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F))
				.texOffs(52, 36).addBox(-2.3959F, 0.05F, -0.0137F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8224F, -2.55F, -2.6863F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(5.625F, -1.3F, 1.3F));

		PartDefinition Head_r8 = leftFace.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(56, 66).addBox(2.6888F, 1.853F, -6.2126F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 48).addBox(2.6888F, 1.853F, -3.2126F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.0647F, 0.3992F, -0.0429F));

		PartDefinition Head_r9 = leftFace.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(60, 91).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-5.1185F, 0.4153F, -14.3987F, -0.3254F, 1.2947F, -0.3182F));

		PartDefinition Head_r10 = leftFace.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(91, 28).addBox(-0.6F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0584F, 0.4769F, -13.6421F, -0.1352F, 0.8677F, -0.1077F));

		PartDefinition Head_r11 = leftFace.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(27, 91).addBox(-0.6F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.0584F, 0.4769F, -13.6421F, -0.1033F, 0.5644F, -0.0597F));

		PartDefinition Head_r12 = leftFace.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(47, 77).addBox(-0.7F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.2856F, 0.5769F, -12.4619F, -0.0962F, 0.4341F, -0.0448F));

		PartDefinition Head_r13 = leftFace.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(18, 66).addBox(3.3377F, 1.8239F, -6.3359F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.0903F, 0.2603F, -0.0276F));

		PartDefinition Head_r14 = leftFace.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(59, 15).addBox(3.6233F, 1.8307F, -2.9532F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.0933F, 0.3471F, -0.0376F));

		PartDefinition Head_r15 = leftFace.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(90, 33).addBox(-2.5126F, 2.5742F, -7.8727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.158F, -0.3493F, 0.0552F));

		PartDefinition Head_r16 = leftFace.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(50, 90).addBox(9.3834F, -2.205F, -3.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.8374F, 1.2501F, 0.886F));

		PartDefinition Head_r17 = leftFace.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(71, 47).addBox(7.5103F, 1.4849F, -3.0391F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.4599F, 1.3331F, -0.4487F));

		PartDefinition Head_r18 = leftFace.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(90, 42).addBox(7.6537F, -1.5755F, -6.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.2791F, 0.8941F, 0.4316F));

		PartDefinition Head_r19 = leftFace.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(76, 40).addBox(6.6697F, 1.4849F, -6.2985F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1719F, 0.9135F, -0.1366F));

		PartDefinition Head_r20 = leftFace.addOrReplaceChild("Head_r20", CubeListBuilder.create().texOffs(90, 45).addBox(5.4331F, -1.0043F, -7.9509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.1244F, 0.5681F, 0.3895F));

		PartDefinition Head_r21 = leftFace.addOrReplaceChild("Head_r21", CubeListBuilder.create().texOffs(70, 62).addBox(3.3396F, 1.4849F, -7.9509F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1243F, 0.5681F, -0.0671F));

		PartDefinition Head_r22 = leftFace.addOrReplaceChild("Head_r22", CubeListBuilder.create().texOffs(90, 48).addBox(4.2691F, -0.7278F, -7.8799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 77).addBox(4.2691F, -0.7278F, -7.7799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0701F, 0.4128F, 0.412F));

		PartDefinition Head_r23 = leftFace.addOrReplaceChild("Head_r23", CubeListBuilder.create().texOffs(0, 43).addBox(1.1081F, 1.4849F, -7.9049F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1139F, 0.4034F, -0.0449F));

		PartDefinition Head_r24 = leftFace.addOrReplaceChild("Head_r24", CubeListBuilder.create().texOffs(38, 67).addBox(3.0678F, -0.4526F, -6.4608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F))
				.texOffs(65, 66).addBox(3.4677F, -0.4526F, -6.4608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0165F, 0.2851F, 0.4247F));

		PartDefinition Head_r25 = leftFace.addOrReplaceChild("Head_r25", CubeListBuilder.create().texOffs(0, 48).addBox(0.2389F, 1.4849F, -6.5608F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1085F, 0.2647F, -0.0285F));

		PartDefinition Head_r26 = leftFace.addOrReplaceChild("Head_r26", CubeListBuilder.create().texOffs(26, 56).addBox(2.6974F, -0.7713F, -3.1768F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0709F, 0.3614F, 0.4742F));

		PartDefinition Head_r27 = leftFace.addOrReplaceChild("Head_r27", CubeListBuilder.create().texOffs(39, 42).addBox(0.5228F, 1.4849F, -3.1768F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1116F, 0.3514F, -0.0385F));

		PartDefinition Head_r28 = leftFace.addOrReplaceChild("Head_r28", CubeListBuilder.create().texOffs(77, 25).addBox(-3.5524F, -0.9851F, 0.7689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.8753F, 0.5F, 1.028F, -0.3735F, -1.1796F, 0.3501F));

		PartDefinition Head_r29 = leftFace.addOrReplaceChild("Head_r29", CubeListBuilder.create().texOffs(70, 59).addBox(-3.8283F, -0.9851F, 0.3264F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.8753F, 0.5F, 1.028F, -0.2346F, -0.929F, 0.1916F));

		PartDefinition Head_r30 = leftFace.addOrReplaceChild("Head_r30", CubeListBuilder.create().texOffs(85, 49).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1132F, 0.6501F, 0.2447F, -0.2243F, -0.848F, -2.2798F));

		PartDefinition Head_r31 = leftFace.addOrReplaceChild("Head_r31", CubeListBuilder.create().texOffs(40, 89).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.6346F, 0.3455F, 0.8346F, -0.6351F, -0.1066F, -1.1057F));

		PartDefinition Head_r32 = leftFace.addOrReplaceChild("Head_r32", CubeListBuilder.create().texOffs(89, 68).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6383F, -0.3989F, -1.995F, -0.4388F, -0.6289F, -2.3399F));

		PartDefinition Head_r33 = leftFace.addOrReplaceChild("Head_r33", CubeListBuilder.create().texOffs(79, 85).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0374F, -0.5162F, -2.2724F, -0.5544F, -0.8598F, -2.1706F));

		PartDefinition Head_r34 = leftFace.addOrReplaceChild("Head_r34", CubeListBuilder.create().texOffs(45, 89).addBox(-1.0F, -0.05F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3615F, -0.6872F, -1.3734F, -0.9812F, 0.0637F, -1.2423F));

		PartDefinition Head_r35 = leftFace.addOrReplaceChild("Head_r35", CubeListBuilder.create().texOffs(74, 85).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.075F, -0.1211F, -1.2174F, -0.2235F, -0.6432F, -2.321F));

		PartDefinition Head_r36 = leftFace.addOrReplaceChild("Head_r36", CubeListBuilder.create().texOffs(85, 46).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8006F, -0.4105F, -0.5931F, -0.6748F, -0.0385F, -1.1605F));

		PartDefinition Head_r37 = leftFace.addOrReplaceChild("Head_r37", CubeListBuilder.create().texOffs(68, 92).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.551F, 0.2345F, -0.4434F, -0.1457F, -0.6725F, -2.3141F));

		PartDefinition Head_r38 = leftFace.addOrReplaceChild("Head_r38", CubeListBuilder.create().texOffs(42, 92).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2766F, -0.0549F, 0.1808F, -0.6787F, -0.1066F, -1.1057F));

		PartDefinition Head_r39 = leftFace.addOrReplaceChild("Head_r39", CubeListBuilder.create().texOffs(35, 89).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6346F, 0.3455F, 0.8346F, -0.8533F, -0.1066F, -1.1057F));

		PartDefinition Head_r40 = leftFace.addOrReplaceChild("Head_r40", CubeListBuilder.create().texOffs(85, 43).addBox(1.4757F, -0.2107F, 1.3791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3753F, 1.8F, -2.272F, 0.5649F, -0.8288F, -0.3635F));

		PartDefinition Head_r41 = leftFace.addOrReplaceChild("Head_r41", CubeListBuilder.create().texOffs(86, 65).addBox(0.01F, -0.2107F, 1.6478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3753F, 1.8F, -2.272F, 0.378F, -0.1991F, -0.0048F));

		PartDefinition Head_r42 = leftFace.addOrReplaceChild("Head_r42", CubeListBuilder.create().texOffs(68, 89).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2993F, 0.95F, -0.863F, 0.0466F, -0.0574F, 0.5066F));

		PartDefinition Head_r43 = leftFace.addOrReplaceChild("Head_r43", CubeListBuilder.create().texOffs(30, 85).addBox(-0.3075F, -0.7718F, 0.9448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3753F, 1.8F, -2.272F, 0.0678F, -0.0294F, 0.027F));

		PartDefinition Head_r44 = leftFace.addOrReplaceChild("Head_r44", CubeListBuilder.create().texOffs(79, 18).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2376F, 0.9255F, -1.6735F, -0.0565F, 0.1479F, 0.5157F));

		PartDefinition Head_r45 = leftFace.addOrReplaceChild("Head_r45", CubeListBuilder.create().texOffs(86, 62).addBox(-0.4414F, -0.9425F, 0.046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3753F, 1.8F, -2.272F, -0.123F, 0.0999F, -0.0099F));

		PartDefinition Head_r46 = leftFace.addOrReplaceChild("Head_r46", CubeListBuilder.create().texOffs(78, 51).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0942F, 0.7996F, -2.619F, 0.0112F, 0.359F, 0.4909F));

		PartDefinition Head_r47 = leftFace.addOrReplaceChild("Head_r47", CubeListBuilder.create().texOffs(22, 89).addBox(0.6294F, 0.7674F, -3.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3753F, 0.5F, 1.028F, -0.1474F, 0.3287F, 0.0281F));

		PartDefinition Head_r48 = leftFace.addOrReplaceChild("Head_r48", CubeListBuilder.create().texOffs(68, 25).addBox(-5.842F, -0.9851F, -2.0501F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.8753F, 0.5F, 1.028F, -0.1424F, -0.1986F, 0.0307F));

		PartDefinition Head_r49 = leftFace.addOrReplaceChild("Head_r49", CubeListBuilder.create().texOffs(90, 39).addBox(0.6607F, 0.7394F, -9.4729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.0772F, 0.1833F, -1.317F));

		PartDefinition Head_r50 = leftFace.addOrReplaceChild("Head_r50", CubeListBuilder.create().texOffs(77, 0).addBox(0.1563F, -1.4028F, -10.7729F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.1572F, 0.1221F, 0.0F));

		PartDefinition Head_r51 = leftFace.addOrReplaceChild("Head_r51", CubeListBuilder.create().texOffs(32, 48).addBox(-2.6571F, 0.3406F, -8.5828F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.0928F, -0.0814F, -2.432F));

		PartDefinition Head_r52 = leftFace.addOrReplaceChild("Head_r52", CubeListBuilder.create().texOffs(17, 48).addBox(-0.5761F, 1.0888F, -8.5828F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1151F, 0.0444F, -1.3475F));

		PartDefinition Head_r53 = leftFace.addOrReplaceChild("Head_r53", CubeListBuilder.create().texOffs(42, 0).addBox(0.1563F, -0.1682F, -8.8828F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0176F, 0.1221F, 0.0F));

		PartDefinition Head_r54 = leftFace.addOrReplaceChild("Head_r54", CubeListBuilder.create().texOffs(68, 21).addBox(-2.0F, 0.0F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2472F, 0.6219F, -3.705F, 0.003F, 0.261F, 0.5033F));

		PartDefinition Head_r55 = leftFace.addOrReplaceChild("Head_r55", CubeListBuilder.create().texOffs(68, 10).addBox(0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(89, 52).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-4.1985F, -1.2024F, -4.0068F, -0.1203F, 0.023F, 0.1642F));

		PartDefinition Head_r56 = leftFace.addOrReplaceChild("Head_r56", CubeListBuilder.create().texOffs(76, 36).addBox(0.0F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2202F, -0.6313F, -2.0677F, -0.0645F, 0.1042F, 0.9913F));

		PartDefinition Head_r57 = leftFace.addOrReplaceChild("Head_r57", CubeListBuilder.create().texOffs(77, 10).addBox(0.2597F, 1.2597F, -2.9657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0458F, 0.0527F, -0.854F));

		PartDefinition Head_r58 = leftFace.addOrReplaceChild("Head_r58", CubeListBuilder.create().texOffs(89, 55).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2231F, -0.7534F, -3.0603F, -0.129F, 0.3694F, 0.1202F));

		PartDefinition Head_r59 = leftFace.addOrReplaceChild("Head_r59", CubeListBuilder.create().texOffs(89, 58).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2231F, -0.7534F, -3.0603F, -0.3641F, 0.1438F, -0.7461F));

		PartDefinition Head_r60 = leftFace.addOrReplaceChild("Head_r60", CubeListBuilder.create().texOffs(77, 14).addBox(1.3205F, -0.2766F, -1.3479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0243F, 0.3791F, 0.1356F));

		PartDefinition Head_r61 = leftFace.addOrReplaceChild("Head_r61", CubeListBuilder.create().texOffs(77, 21).addBox(0.632F, 1.6726F, -1.3479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.2927F, 0.2456F, -0.8218F));

		PartDefinition Head_r62 = leftFace.addOrReplaceChild("Head_r62", CubeListBuilder.create().texOffs(91, 16).addBox(0.293F, 1.2326F, -3.0157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(90, 75).addBox(0.293F, 1.2326F, -2.6657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0461F, 0.0525F, -0.8496F));

		PartDefinition Head_r63 = leftFace.addOrReplaceChild("Head_r63", CubeListBuilder.create().texOffs(91, 25).addBox(-6.5025F, -1.9242F, -8.1451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.2367F, -0.7185F, 0.1403F));

		PartDefinition Head_r64 = leftFace.addOrReplaceChild("Head_r64", CubeListBuilder.create().texOffs(91, 19).addBox(-0.388F, -0.6521F, -3.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0619F, -0.4137F, 0.165F));

		PartDefinition Head_r65 = leftFace.addOrReplaceChild("Head_r65", CubeListBuilder.create().texOffs(90, 78).addBox(1.0603F, -0.6433F, -3.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0689F, 0.0236F, 0.1635F));

		PartDefinition Head_r66 = leftFace.addOrReplaceChild("Head_r66", CubeListBuilder.create().texOffs(55, 90).addBox(0.7305F, -0.4433F, -2.6657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0689F, -0.0112F, 0.1611F));

		PartDefinition Head_r67 = leftFace.addOrReplaceChild("Head_r67", CubeListBuilder.create().texOffs(40, 77).addBox(0.6911F, -0.471F, -2.9657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.0685F, -0.0133F, 0.1915F));

		PartDefinition Head_r68 = leftFace.addOrReplaceChild("Head_r68", CubeListBuilder.create().texOffs(37, 92).addBox(-0.1964F, 0.2627F, -1.9934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.1325F, -0.0499F, -0.3991F));

		PartDefinition Head_r69 = leftFace.addOrReplaceChild("Head_r69", CubeListBuilder.create().texOffs(91, 22).addBox(-0.2959F, -0.8666F, -3.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.3288F, -0.0989F, -0.4053F));

		PartDefinition Head_r70 = leftFace.addOrReplaceChild("Head_r70", CubeListBuilder.create().texOffs(90, 36).addBox(-0.2959F, -0.2412F, -3.0333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, 0.1194F, -0.0989F, -0.4053F));

		PartDefinition Head_r71 = leftFace.addOrReplaceChild("Head_r71", CubeListBuilder.create().texOffs(84, 85).addBox(0.7204F, -0.3638F, -1.0051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9751F, -0.9849F, -3.7306F, -0.0514F, 0.01F, 0.1917F));

		PartDefinition Head_r72 = leftFace.addOrReplaceChild("Head_r72", CubeListBuilder.create().texOffs(74, 32).addBox(0.2094F, 0.6788F, -5.5287F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3753F, 0.5F, 1.028F, -0.1222F, 0.2313F, 0.0F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-5.7721F, -1.3F, 1.3F));

		PartDefinition Head_r73 = rightFace.addOrReplaceChild("Head_r73", CubeListBuilder.create().texOffs(56, 66).mirror().addBox(-3.6888F, 1.853F, -6.2126F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 48).mirror().addBox(-3.6888F, 1.853F, -3.2126F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.0647F, -0.3992F, 0.0429F));

		PartDefinition Head_r74 = rightFace.addOrReplaceChild("Head_r74", CubeListBuilder.create().texOffs(60, 91).mirror().addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(5.1185F, 0.4153F, -14.3987F, -0.3254F, -1.2947F, 0.3182F));

		PartDefinition Head_r75 = rightFace.addOrReplaceChild("Head_r75", CubeListBuilder.create().texOffs(91, 28).mirror().addBox(-0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.0584F, 0.4769F, -13.6421F, -0.1352F, -0.8677F, 0.1077F));

		PartDefinition Head_r76 = rightFace.addOrReplaceChild("Head_r76", CubeListBuilder.create().texOffs(27, 91).mirror().addBox(-0.4F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.0584F, 0.4769F, -13.6421F, -0.1033F, -0.5644F, 0.0597F));

		PartDefinition Head_r77 = rightFace.addOrReplaceChild("Head_r77", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.3F, -0.5F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(3.2856F, 0.5769F, -12.4619F, -0.0962F, -0.4341F, 0.0448F));

		PartDefinition Head_r78 = rightFace.addOrReplaceChild("Head_r78", CubeListBuilder.create().texOffs(18, 66).mirror().addBox(-4.3377F, 1.8239F, -6.3359F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.0903F, -0.2603F, 0.0276F));

		PartDefinition Head_r79 = rightFace.addOrReplaceChild("Head_r79", CubeListBuilder.create().texOffs(59, 15).mirror().addBox(-4.6233F, 1.8307F, -2.9532F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.0933F, -0.3471F, 0.0376F));

		PartDefinition Head_r80 = rightFace.addOrReplaceChild("Head_r80", CubeListBuilder.create().texOffs(90, 33).mirror().addBox(1.5126F, 2.5742F, -7.8727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.158F, 0.3493F, -0.0552F));

		PartDefinition Head_r81 = rightFace.addOrReplaceChild("Head_r81", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(-10.3834F, -2.205F, -3.0391F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.8374F, -1.2501F, -0.886F));

		PartDefinition Head_r82 = rightFace.addOrReplaceChild("Head_r82", CubeListBuilder.create().texOffs(71, 47).mirror().addBox(-10.5103F, 1.4849F, -3.0391F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.4599F, -1.3331F, 0.4487F));

		PartDefinition Head_r83 = rightFace.addOrReplaceChild("Head_r83", CubeListBuilder.create().texOffs(90, 42).mirror().addBox(-8.6537F, -1.5755F, -6.2985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.2791F, -0.8941F, -0.4316F));

		PartDefinition Head_r84 = rightFace.addOrReplaceChild("Head_r84", CubeListBuilder.create().texOffs(76, 40).mirror().addBox(-8.6697F, 1.4849F, -6.2985F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1719F, -0.9135F, 0.1366F));

		PartDefinition Head_r85 = rightFace.addOrReplaceChild("Head_r85", CubeListBuilder.create().texOffs(90, 45).mirror().addBox(-6.4331F, -1.0043F, -7.9509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.1244F, -0.5681F, -0.3895F));

		PartDefinition Head_r86 = rightFace.addOrReplaceChild("Head_r86", CubeListBuilder.create().texOffs(70, 62).mirror().addBox(-6.3396F, 1.4849F, -7.9509F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1243F, -0.5681F, 0.0671F));

		PartDefinition Head_r87 = rightFace.addOrReplaceChild("Head_r87", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-5.2691F, -0.7278F, -7.8799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 77).mirror().addBox(-5.2691F, -0.7278F, -7.7799F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0701F, -0.4128F, -0.412F));

		PartDefinition Head_r88 = rightFace.addOrReplaceChild("Head_r88", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-5.1081F, 1.4849F, -7.9049F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1139F, -0.4034F, 0.0449F));

		PartDefinition Head_r89 = rightFace.addOrReplaceChild("Head_r89", CubeListBuilder.create().texOffs(38, 67).mirror().addBox(-4.0678F, -0.4526F, -6.4608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(65, 66).mirror().addBox(-4.4678F, -0.4526F, -6.4608F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0165F, -0.2851F, -0.4247F));

		PartDefinition Head_r90 = rightFace.addOrReplaceChild("Head_r90", CubeListBuilder.create().texOffs(0, 48).mirror().addBox(-4.2389F, 1.4849F, -6.5608F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1085F, -0.2647F, 0.0285F));

		PartDefinition Head_r91 = rightFace.addOrReplaceChild("Head_r91", CubeListBuilder.create().texOffs(26, 56).mirror().addBox(-4.6974F, -0.7713F, -3.1768F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0709F, -0.3614F, -0.4742F));

		PartDefinition Head_r92 = rightFace.addOrReplaceChild("Head_r92", CubeListBuilder.create().texOffs(39, 42).mirror().addBox(-4.5228F, 1.4849F, -3.1768F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1116F, -0.3514F, 0.0385F));

		PartDefinition Head_r93 = rightFace.addOrReplaceChild("Head_r93", CubeListBuilder.create().texOffs(77, 25).mirror().addBox(1.5524F, -0.9851F, 0.7689F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.8752F, 0.5F, 1.028F, -0.3735F, 1.1796F, -0.3501F));

		PartDefinition Head_r94 = rightFace.addOrReplaceChild("Head_r94", CubeListBuilder.create().texOffs(70, 59).mirror().addBox(0.8283F, -0.9851F, 0.3264F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.8752F, 0.5F, 1.028F, -0.2346F, 0.929F, -0.1916F));

		PartDefinition Head_r95 = rightFace.addOrReplaceChild("Head_r95", CubeListBuilder.create().texOffs(85, 49).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1133F, 0.6501F, 0.2447F, -0.2243F, 0.848F, 2.2798F));

		PartDefinition Head_r96 = rightFace.addOrReplaceChild("Head_r96", CubeListBuilder.create().texOffs(40, 89).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.6346F, 0.3455F, 0.8346F, -0.6351F, 0.1066F, 1.1057F));

		PartDefinition Head_r97 = rightFace.addOrReplaceChild("Head_r97", CubeListBuilder.create().texOffs(89, 68).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.6383F, -0.3989F, -1.995F, -0.4388F, 0.6289F, 2.3399F));

		PartDefinition Head_r98 = rightFace.addOrReplaceChild("Head_r98", CubeListBuilder.create().texOffs(79, 85).mirror().addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0374F, -0.5162F, -2.2724F, -0.5544F, 0.8598F, 2.1706F));

		PartDefinition Head_r99 = rightFace.addOrReplaceChild("Head_r99", CubeListBuilder.create().texOffs(45, 89).mirror().addBox(0.0F, -0.05F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3615F, -0.6872F, -1.3734F, -0.9812F, -0.0637F, 1.2423F));

		PartDefinition Head_r100 = rightFace.addOrReplaceChild("Head_r100", CubeListBuilder.create().texOffs(74, 85).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.075F, -0.1211F, -1.2174F, -0.2235F, 0.6432F, 2.321F));

		PartDefinition Head_r101 = rightFace.addOrReplaceChild("Head_r101", CubeListBuilder.create().texOffs(85, 46).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.8006F, -0.4105F, -0.5931F, -0.6748F, 0.0385F, 1.1605F));

		PartDefinition Head_r102 = rightFace.addOrReplaceChild("Head_r102", CubeListBuilder.create().texOffs(68, 92).mirror().addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.551F, 0.2345F, -0.4434F, -0.1457F, 0.6725F, 2.3141F));

		PartDefinition Head_r103 = rightFace.addOrReplaceChild("Head_r103", CubeListBuilder.create().texOffs(42, 92).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2766F, -0.0549F, 0.1808F, -0.6787F, 0.1066F, 1.1057F));

		PartDefinition Head_r104 = rightFace.addOrReplaceChild("Head_r104", CubeListBuilder.create().texOffs(35, 89).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6346F, 0.3455F, 0.8346F, -0.8533F, 0.1066F, 1.1057F));

		PartDefinition Head_r105 = rightFace.addOrReplaceChild("Head_r105", CubeListBuilder.create().texOffs(85, 43).mirror().addBox(-2.4757F, -0.2107F, 1.3791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3752F, 1.8F, -2.272F, 0.5649F, 0.8288F, 0.3635F));

		PartDefinition Head_r106 = rightFace.addOrReplaceChild("Head_r106", CubeListBuilder.create().texOffs(86, 65).mirror().addBox(-1.01F, -0.2107F, 1.6478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3752F, 1.8F, -2.272F, 0.378F, 0.1991F, 0.0048F));

		PartDefinition Head_r107 = rightFace.addOrReplaceChild("Head_r107", CubeListBuilder.create().texOffs(68, 89).mirror().addBox(0.0F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2993F, 0.95F, -0.863F, 0.0466F, 0.0574F, -0.5066F));

		PartDefinition Head_r108 = rightFace.addOrReplaceChild("Head_r108", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.6925F, -0.7718F, 0.9448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3752F, 1.8F, -2.272F, 0.0678F, 0.0294F, -0.027F));

		PartDefinition Head_r109 = rightFace.addOrReplaceChild("Head_r109", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2376F, 0.9255F, -1.6735F, -0.0565F, -0.1479F, -0.5157F));

		PartDefinition Head_r110 = rightFace.addOrReplaceChild("Head_r110", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(-0.5586F, -0.9425F, 0.046F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3752F, 1.8F, -2.272F, -0.123F, -0.0999F, 0.0099F));

		PartDefinition Head_r111 = rightFace.addOrReplaceChild("Head_r111", CubeListBuilder.create().texOffs(78, 51).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0942F, 0.7996F, -2.619F, 0.0112F, -0.359F, -0.4909F));

		PartDefinition Head_r112 = rightFace.addOrReplaceChild("Head_r112", CubeListBuilder.create().texOffs(22, 89).mirror().addBox(-1.6294F, 0.7674F, -3.7198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3752F, 0.5F, 1.028F, -0.1474F, -0.3287F, -0.0281F));

		PartDefinition Head_r113 = rightFace.addOrReplaceChild("Head_r113", CubeListBuilder.create().texOffs(68, 25).mirror().addBox(2.842F, -0.9851F, -2.0501F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.8752F, 0.5F, 1.028F, -0.1424F, 0.1986F, -0.0307F));

		PartDefinition Head_r114 = rightFace.addOrReplaceChild("Head_r114", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-1.6607F, 0.7394F, -9.4729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.0772F, -0.1833F, 1.317F));

		PartDefinition Head_r115 = rightFace.addOrReplaceChild("Head_r115", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-1.1563F, -1.4028F, -10.7729F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.1572F, -0.1221F, 0.0F));

		PartDefinition Head_r116 = rightFace.addOrReplaceChild("Head_r116", CubeListBuilder.create().texOffs(32, 48).mirror().addBox(1.6571F, 0.3406F, -8.5828F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.0928F, 0.0814F, 2.432F));

		PartDefinition Head_r117 = rightFace.addOrReplaceChild("Head_r117", CubeListBuilder.create().texOffs(17, 48).mirror().addBox(-0.4239F, 1.0888F, -8.5828F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1151F, -0.0444F, 1.3475F));

		PartDefinition Head_r118 = rightFace.addOrReplaceChild("Head_r118", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.1563F, -0.1682F, -8.8828F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0176F, -0.1221F, 0.0F));

		PartDefinition Head_r119 = rightFace.addOrReplaceChild("Head_r119", CubeListBuilder.create().texOffs(68, 21).mirror().addBox(0.0F, 0.0F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2472F, 0.6219F, -3.705F, 0.003F, -0.261F, -0.5033F));

		PartDefinition Head_r120 = rightFace.addOrReplaceChild("Head_r120", CubeListBuilder.create().texOffs(68, 10).mirror().addBox(-2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(89, 52).mirror().addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(4.1985F, -1.2024F, -4.0068F, -0.1203F, -0.023F, -0.1642F));

		PartDefinition Head_r121 = rightFace.addOrReplaceChild("Head_r121", CubeListBuilder.create().texOffs(76, 36).mirror().addBox(-1.0F, 0.0F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2202F, -0.6313F, -2.0677F, -0.0645F, -0.1042F, -0.9913F));

		PartDefinition Head_r122 = rightFace.addOrReplaceChild("Head_r122", CubeListBuilder.create().texOffs(77, 10).mirror().addBox(-1.2597F, 1.2597F, -2.9657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0458F, -0.0527F, 0.854F));

		PartDefinition Head_r123 = rightFace.addOrReplaceChild("Head_r123", CubeListBuilder.create().texOffs(89, 55).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2231F, -0.7534F, -3.0603F, -0.129F, -0.3694F, -0.1202F));

		PartDefinition Head_r124 = rightFace.addOrReplaceChild("Head_r124", CubeListBuilder.create().texOffs(89, 58).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2231F, -0.7534F, -3.0603F, -0.3641F, -0.1438F, 0.7461F));

		PartDefinition Head_r125 = rightFace.addOrReplaceChild("Head_r125", CubeListBuilder.create().texOffs(77, 14).mirror().addBox(-2.3205F, -0.2766F, -1.3479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0243F, -0.3791F, -0.1356F));

		PartDefinition Head_r126 = rightFace.addOrReplaceChild("Head_r126", CubeListBuilder.create().texOffs(77, 21).mirror().addBox(-1.632F, 1.6726F, -1.3479F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.2927F, -0.2456F, 0.8218F));

		PartDefinition Head_r127 = rightFace.addOrReplaceChild("Head_r127", CubeListBuilder.create().texOffs(91, 16).mirror().addBox(-1.293F, 1.2326F, -3.0157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(90, 75).mirror().addBox(-1.293F, 1.2326F, -2.6657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0461F, -0.0525F, 0.8496F));

		PartDefinition Head_r128 = rightFace.addOrReplaceChild("Head_r128", CubeListBuilder.create().texOffs(91, 25).mirror().addBox(5.5025F, -1.9242F, -8.1451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.2367F, 0.7185F, -0.1403F));

		PartDefinition Head_r129 = rightFace.addOrReplaceChild("Head_r129", CubeListBuilder.create().texOffs(91, 19).mirror().addBox(-0.612F, -0.6521F, -3.516F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0619F, 0.4137F, -0.165F));

		PartDefinition Head_r130 = rightFace.addOrReplaceChild("Head_r130", CubeListBuilder.create().texOffs(90, 78).mirror().addBox(-2.0603F, -0.6433F, -3.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0689F, -0.0236F, -0.1635F));

		PartDefinition Head_r131 = rightFace.addOrReplaceChild("Head_r131", CubeListBuilder.create().texOffs(55, 90).mirror().addBox(-1.7305F, -0.4433F, -2.6657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0689F, 0.0112F, -0.1611F));

		PartDefinition Head_r132 = rightFace.addOrReplaceChild("Head_r132", CubeListBuilder.create().texOffs(40, 77).mirror().addBox(-1.6911F, -0.471F, -2.9657F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.0685F, 0.0133F, -0.1915F));

		PartDefinition Head_r133 = rightFace.addOrReplaceChild("Head_r133", CubeListBuilder.create().texOffs(37, 92).mirror().addBox(-0.8036F, 0.2627F, -1.9934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.1325F, 0.0499F, 0.3991F));

		PartDefinition Head_r134 = rightFace.addOrReplaceChild("Head_r134", CubeListBuilder.create().texOffs(91, 22).mirror().addBox(-0.7041F, -0.8666F, -3.9169F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.3288F, 0.0989F, 0.4053F));

		PartDefinition Head_r135 = rightFace.addOrReplaceChild("Head_r135", CubeListBuilder.create().texOffs(90, 36).mirror().addBox(-0.7041F, -0.2412F, -3.0333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, 0.1194F, 0.0989F, 0.4053F));

		PartDefinition Head_r136 = rightFace.addOrReplaceChild("Head_r136", CubeListBuilder.create().texOffs(84, 85).mirror().addBox(-1.7204F, -0.3638F, -1.0051F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9751F, -0.9849F, -3.7306F, -0.0514F, -0.01F, -0.1917F));

		PartDefinition Head_r137 = rightFace.addOrReplaceChild("Head_r137", CubeListBuilder.create().texOffs(74, 32).mirror().addBox(-1.2094F, 0.6788F, -5.5287F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.3752F, 0.5F, 1.028F, -0.1222F, -0.2313F, 0.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(69, 86).addBox(4.6F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(69, 86).mirror().addBox(-5.7471F, -0.8F, 0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8799F, 1.1759F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r143 = jaw.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(12, 71).mirror().addBox(-0.5F, -0.675F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.8221F, 0.853F, -3.3793F, -1.0996F, -0.2356F, 0.0F));

		PartDefinition cube_r144 = jaw.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(12, 76).mirror().addBox(0.0F, -0.0195F, -2.432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.7471F, 2.2075F, -1.6685F, -1.3177F, -0.2356F, 0.0F));

		PartDefinition cube_r145 = jaw.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(15, 80).mirror().addBox(-0.0195F, 0.1271F, -1.2342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0416F, 2.8407F, -4.7057F, -1.501F, -0.3229F, 0.0F));

		PartDefinition cube_r146 = jaw.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(73, 75).mirror().addBox(-0.0195F, 2.0627F, -0.8428F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.0416F, 2.8407F, -4.7057F, -1.4661F, -0.3229F, 0.0F));

		PartDefinition cube_r147 = jaw.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 88).mirror().addBox(-0.3222F, 0.5643F, -0.4797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.0728F, 3.2695F, -12.9905F, -1.3939F, -0.8966F, -0.1289F));

		PartDefinition cube_r148 = jaw.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(88, 82).mirror().addBox(-0.1866F, -0.1474F, -0.4953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-2.0728F, 3.2695F, -12.9905F, -1.4088F, -0.6852F, -0.1546F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(32, 92).mirror().addBox(-0.0927F, -0.1543F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.5728F, 3.2695F, -12.3905F, -1.3828F, -0.5347F, -0.1775F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(79, 88).mirror().addBox(-0.0927F, -0.0597F, -0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(-2.5728F, 3.2695F, -12.3905F, -1.3916F, -0.5347F, -0.1775F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(74, 88).mirror().addBox(-0.1866F, -0.2298F, -0.1531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0728F, 3.2695F, -12.9905F, -1.6008F, -0.6852F, -0.1546F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-0.3222F, 0.5868F, -0.1801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.0728F, 3.2695F, -12.9905F, -1.5684F, -0.8966F, -0.1289F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.0219F, -0.6355F, -0.5149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.2728F, 3.2695F, -10.2905F, -1.4128F, -0.3054F, -0.0526F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 88).mirror().addBox(-0.5633F, -0.9052F, -0.5646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.6099F, 2.8958F, -13.0576F, -1.562F, -0.6547F, -0.0551F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(30, 88).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.6013F, 2.9207F, -13.8649F, -0.328F, -1.3305F, -1.3078F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(75, 69).mirror().addBox(-0.5373F, -0.0878F, -0.9678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.6099F, 2.8958F, -13.0576F, -1.3866F, -0.883F, -0.1889F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-0.5F, -0.5F, -0.425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-4.3326F, 1.204F, -5.6182F, -1.318F, -0.3013F, -0.0433F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(64, 79).mirror().addBox(-0.55F, -1.425F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.5716F, 2.7133F, -10.9031F, -1.3987F, -0.2835F, -0.0012F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(79, 58).mirror().addBox(-0.0219F, -0.5831F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-3.2728F, 3.2695F, -10.2905F, -1.3779F, -0.3054F, -0.0526F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(79, 4).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5629F, 1.8011F, -7.611F, -1.3439F, -0.3229F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(78, 78).mirror().addBox(-0.0195F, -0.0935F, -1.888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-5.0416F, 2.8407F, -4.7057F, -1.2915F, -0.3229F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(22, 92).mirror().addBox(-0.0075F, -1.0674F, -0.7848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9471F, 2.2075F, -4.9685F, -1.3788F, -0.2356F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-0.0195F, -0.0107F, -0.485F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-5.0416F, 2.8407F, -4.7057F, -1.5795F, -0.3229F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(55, 87).mirror().addBox(-0.5F, 0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.823F, 1.7973F, -3.3756F, -1.3177F, -0.2356F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.8273F, 1.9462F, -3.3578F, -1.4486F, -0.2356F, 0.0F));

		PartDefinition cube_r166 = jaw.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(66, 75).mirror().addBox(0.0F, -0.4464F, -1.1875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(66, 75).addBox(10.3471F, -0.4464F, -1.1875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7471F, 2.2075F, -1.6685F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r167 = jaw.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-5.0F, 0.025F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(67, 38).addBox(5.3471F, 0.025F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.7471F, 2.2849F, -0.2687F, -0.9512F, 0.0F, 0.0F));

		PartDefinition cube_r168 = jaw.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(74, 65).mirror().addBox(-5.0F, 0.5F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 65).addBox(5.3471F, 0.5F, -1.875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7471F, 1.1397F, 0.658F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r169 = jaw.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(77, 54).mirror().addBox(-0.5F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(77, 54).addBox(9.8471F, 0.1F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-5.2471F, 0.5672F, 0.5471F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r170 = jaw.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(50, 87).mirror().addBox(-5.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(50, 87).addBox(5.3471F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.7471F, 0.2F, 1.4F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r171 = jaw.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-5.0F, -0.3F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(5, 78).addBox(5.3471F, -0.3F, 0.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7471F, -0.8F, 0.4F, -1.4748F, 0.0F, 0.0F));

		PartDefinition cube_r172 = jaw.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(12, 71).addBox(-0.5F, -0.675F, -0.525F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.6751F, 0.853F, -3.3793F, -1.0996F, 0.2356F, 0.0F));

		PartDefinition cube_r173 = jaw.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(12, 76).addBox(-1.0F, -0.0195F, -2.432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.6F, 2.2075F, -1.6685F, -1.3177F, 0.2356F, 0.0F));

		PartDefinition cube_r174 = jaw.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(15, 80).addBox(-0.9805F, 0.1271F, -1.2342F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8946F, 2.8407F, -4.7057F, -1.501F, 0.3229F, 0.0F));

		PartDefinition cube_r175 = jaw.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(73, 75).addBox(-0.9805F, 2.0627F, -0.8428F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.8946F, 2.8407F, -4.7057F, -1.4661F, 0.3229F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(84, 88).addBox(-0.6778F, 0.5643F, -0.4797F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(1.9257F, 3.2695F, -12.9905F, -1.3939F, 0.8966F, 0.1289F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(88, 82).addBox(-0.8134F, -0.1474F, -0.4953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9257F, 3.2695F, -12.9905F, -1.4088F, 0.6852F, 0.1546F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(78, 43).addBox(-3.3064F, 0.6787F, -0.2585F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.2329F, 3.1893F, -12.5153F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(32, 92).addBox(-0.9073F, -0.1543F, -0.4896F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.4257F, 3.2695F, -12.3905F, -1.3828F, 0.5347F, 0.1775F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(79, 88).addBox(-0.9073F, -0.0597F, -0.1541F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(2.4257F, 3.2695F, -12.3905F, -1.3916F, 0.5347F, 0.1775F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(74, 88).addBox(-0.8134F, -0.2298F, -0.1531F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9257F, 3.2695F, -12.9905F, -1.6008F, 0.6852F, 0.1546F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(88, 72).addBox(-0.6778F, 0.5868F, -0.1801F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9257F, 3.2695F, -12.9905F, -1.5684F, 0.8966F, 0.1289F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(10, 80).addBox(-0.9781F, -0.6355F, -0.5149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1257F, 3.2695F, -10.2905F, -1.4128F, 0.3054F, 0.0526F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(60, 88).addBox(-0.4367F, -0.9052F, -0.5646F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.4628F, 2.8958F, -13.0576F, -1.562F, 0.6547F, 0.0551F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(30, 88).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.4543F, 2.9207F, -13.8649F, -0.328F, 1.3305F, 1.3078F));

		PartDefinition cube_r186 = jaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(75, 69).addBox(-0.4627F, -0.0878F, -0.9678F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.4628F, 2.8958F, -13.0576F, -1.3866F, 0.883F, 0.1889F));

		PartDefinition cube_r187 = jaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(7, 71).addBox(-0.5F, -0.5F, -0.425F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(4.1856F, 1.204F, -5.6182F, -1.318F, 0.3013F, 0.0433F));

		PartDefinition cube_r188 = jaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(64, 79).addBox(-0.45F, -1.425F, -0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.4245F, 2.7133F, -10.9031F, -1.3987F, 0.2835F, 0.0012F));

		PartDefinition cube_r189 = jaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(79, 58).addBox(-0.9781F, -0.5831F, -0.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(3.1257F, 3.2695F, -10.2905F, -1.3779F, 0.3054F, 0.0526F));

		PartDefinition cube_r190 = jaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(79, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4158F, 1.8011F, -7.611F, -1.3439F, 0.3229F, 0.0F));

		PartDefinition cube_r191 = jaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(78, 78).addBox(-0.9805F, -0.0935F, -1.888F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.8946F, 2.8407F, -4.7057F, -1.2915F, 0.3229F, 0.0F));

		PartDefinition cube_r192 = jaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(22, 92).addBox(-0.9925F, -1.0674F, -0.7848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8F, 2.2075F, -4.9685F, -1.3788F, 0.2356F, 0.0F));

		PartDefinition cube_r193 = jaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(78, 73).addBox(-0.9805F, -0.0107F, -0.485F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.8946F, 2.8407F, -4.7057F, -1.5795F, 0.3229F, 0.0F));

		PartDefinition cube_r194 = jaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(55, 87).addBox(-0.5F, 0.5F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.676F, 1.7973F, -3.3756F, -1.3177F, 0.2356F, 0.0F));

		PartDefinition cube_r195 = jaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -1.5F, -0.75F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.6802F, 1.9462F, -3.3578F, -1.4486F, 0.2356F, 0.0F));

		PartDefinition Tailbase = Hips.addOrReplaceChild("Tailbase", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5294F, -0.4594F, -0.1247F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.45F, -0.2381F, 0.6623F, -0.1357F, 0.0865F, -0.0118F));

		PartDefinition Tailbase_r1 = Tailbase.addOrReplaceChild("Tailbase_r1", CubeListBuilder.create().texOffs(50, 93).addBox(1.4206F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.4594F, 6.8753F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailbase_r2 = Tailbase.addOrReplaceChild("Tailbase_r2", CubeListBuilder.create().texOffs(76, 94).addBox(1.4206F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.4594F, 4.8753F, -0.1396F, 0.0F, 0.0F));

		PartDefinition Tailbase_r3 = Tailbase.addOrReplaceChild("Tailbase_r3", CubeListBuilder.create().texOffs(73, 94).addBox(1.4206F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.4594F, 2.8753F, -0.0262F, 0.0F, 0.0F));

		PartDefinition Tailbase_r4 = Tailbase.addOrReplaceChild("Tailbase_r4", CubeListBuilder.create().texOffs(6, 89).addBox(1.4206F, -0.0563F, -0.5671F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.2594F, 7.2753F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailbase_r5 = Tailbase.addOrReplaceChild("Tailbase_r5", CubeListBuilder.create().texOffs(3, 89).addBox(1.4206F, -0.0527F, -0.9698F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.2594F, 5.2753F, 0.6458F, 0.0F, 0.0F));

		PartDefinition Tailbase_r6 = Tailbase.addOrReplaceChild("Tailbase_r6", CubeListBuilder.create().texOffs(89, 2).addBox(1.4206F, 1.3F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.4594F, 0.8753F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Tailbase_r7 = Tailbase.addOrReplaceChild("Tailbase_r7", CubeListBuilder.create().texOffs(68, 95).addBox(1.4206F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, -0.4594F, 0.8753F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailbase_r8 = Tailbase.addOrReplaceChild("Tailbase_r8", CubeListBuilder.create().texOffs(0, 24).mirror().addBox(-2.8991F, 0.0F, 1.0511F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8911F, 0.0406F, -0.2247F, 0.0F, 0.0349F, 0.0F));

		PartDefinition Tailbase_r9 = Tailbase.addOrReplaceChild("Tailbase_r9", CubeListBuilder.create().texOffs(0, 24).addBox(0.8991F, 0.0F, 1.0511F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 0.0406F, -0.2247F, 0.0F, -0.0349F, 0.0F));

		PartDefinition Tailbase_r10 = Tailbase.addOrReplaceChild("Tailbase_r10", CubeListBuilder.create().texOffs(33, 73).addBox(1.4206F, -0.1F, 0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.45F, 0.9548F, -0.8318F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase = Tailbase.addOrReplaceChild("Tailmiddlebase", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5544F, -0.4F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.025F, -0.0591F, 8.8013F, 0.1446F, -0.1295F, -0.0188F));

		PartDefinition Tailmiddlebase_r1 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r1", CubeListBuilder.create().texOffs(84, 94).addBox(1.4206F, -1.9F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(94, 67).addBox(1.4206F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.475F, -0.4F, 4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r2 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r2", CubeListBuilder.create().texOffs(87, 94).addBox(1.4206F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.475F, -0.4F, 2.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r3 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r3", CubeListBuilder.create().texOffs(61, 94).addBox(1.4206F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.475F, -0.4F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailmiddlebase_r4 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r4", CubeListBuilder.create().texOffs(21, 23).mirror().addBox(-2.5187F, -0.0023F, -1.0731F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.8661F, 0.1F, 1.0F, -0.0013F, 0.0086F, -0.0017F));

		PartDefinition Tailmiddlebase_r5 = Tailmiddlebase.addOrReplaceChild("Tailmiddlebase_r5", CubeListBuilder.create().texOffs(21, 23).addBox(0.5187F, -0.0023F, -1.0731F, 2.0F, 0.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.975F, 0.1F, 1.0F, -0.0013F, -0.0086F, 0.0017F));

		PartDefinition Tailbase_r11 = Tailmiddlebase.addOrReplaceChild("Tailbase_r11", CubeListBuilder.create().texOffs(14, 89).addBox(1.4206F, 2.5437F, 3.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 89).addBox(1.4206F, 3.8437F, 5.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 88).addBox(1.4206F, 1.3437F, 1.4329F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.2124F, -1.5236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddle = Tailmiddlebase.addOrReplaceChild("Tailmiddle", CubeListBuilder.create().texOffs(0, 54).addBox(-0.4794F, -0.3024F, 0.0764F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-0.075F, -0.075F, 6.9004F, 0.0176F, -0.1309F, -0.0023F));

		PartDefinition Tailmiddle_r1 = Tailmiddle.addOrReplaceChild("Tailmiddle_r1", CubeListBuilder.create().texOffs(47, 92).addBox(1.4206F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.4F, -0.0024F, 3.0764F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r2 = Tailmiddle.addOrReplaceChild("Tailmiddle_r2", CubeListBuilder.create().texOffs(58, 94).addBox(1.4206F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-1.4F, -0.3024F, 1.0764F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Tailmiddle_r3 = Tailmiddle.addOrReplaceChild("Tailmiddle_r3", CubeListBuilder.create().texOffs(68, 0).mirror().addBox(-2.4152F, 0.0F, 0.878F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0411F, 0.1976F, 0.0764F, 0.0F, 0.0873F, 0.0F));

		PartDefinition Tailmiddle_r4 = Tailmiddle.addOrReplaceChild("Tailmiddle_r4", CubeListBuilder.create().texOffs(68, 0).addBox(1.4152F, 0.0F, 0.878F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.1976F, 0.0764F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tailbase_r12 = Tailmiddle.addOrReplaceChild("Tailbase_r12", CubeListBuilder.create().texOffs(5, 94).addBox(1.4206F, 4.5437F, 5.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 93).addBox(1.4206F, 5.5437F, 7.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -0.1124F, -6.4236F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend = Tailmiddle.addOrReplaceChild("Tailmiddleend", CubeListBuilder.create().texOffs(21, 13).addBox(-0.5544F, -0.6008F, 0.0255F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.075F, 0.3416F, 5.0413F, 0.0924F, -0.1303F, -0.012F));

		PartDefinition Tailmiddleend_r1 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r1", CubeListBuilder.create().texOffs(30, 81).addBox(1.4206F, -1.45F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(50, 73).addBox(1.4206F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.475F, -0.6008F, 4.0255F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r2 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r2", CubeListBuilder.create().texOffs(94, 55).addBox(1.4206F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.475F, -0.6008F, 2.0255F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailmiddleend_r3 = Tailmiddleend.addOrReplaceChild("Tailmiddleend_r3", CubeListBuilder.create().texOffs(94, 85).addBox(1.4206F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.475F, -0.6008F, 0.0255F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailbase_r13 = Tailmiddleend.addOrReplaceChild("Tailbase_r13", CubeListBuilder.create().texOffs(39, 95).addBox(1.4206F, 9.7437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 94).addBox(1.4206F, 7.6437F, 11.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 10).addBox(1.4206F, 6.5437F, 9.4329F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.4235F, -11.4427F, 0.5585F, 0.0F, 0.0F));

		PartDefinition Tailend = Tailmiddleend.addOrReplaceChild("Tailend", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5544F, -0.5018F, 0.0425F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0801F, 7.9632F, -0.0623F, -0.2178F, 0.0135F));

		PartDefinition Tailend_r1 = Tailend.addOrReplaceChild("Tailend_r1", CubeListBuilder.create().texOffs(53, 95).addBox(1.4206F, -0.45F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.5018F, 6.0425F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tailend_r2 = Tailend.addOrReplaceChild("Tailend_r2", CubeListBuilder.create().texOffs(95, 48).addBox(1.4206F, -0.825F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.5018F, 4.0425F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Tailend_r3 = Tailend.addOrReplaceChild("Tailend_r3", CubeListBuilder.create().texOffs(94, 51).addBox(1.4206F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.5018F, 2.0425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailend_r4 = Tailend.addOrReplaceChild("Tailend_r4", CubeListBuilder.create().texOffs(27, 94).addBox(1.4206F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.5018F, 0.0425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tailbase_r14 = Tailend.addOrReplaceChild("Tailbase_r14", CubeListBuilder.create().texOffs(95, 45).addBox(1.4206F, 12.7437F, 19.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 42).addBox(1.4206F, 11.8437F, 17.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 95).addBox(1.4206F, 10.9437F, 15.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 39).addBox(1.4206F, 9.8437F, 13.4329F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.475F, -0.3442F, -17.402F, 0.5585F, 0.0F, 0.0F));

		PartDefinition hindlegL = Hips.addOrReplaceChild("hindlegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3599F, 3.6655F, -2.882F, 0.5668F, -0.7077F, -1.9994F));

		PartDefinition cube_r196 = hindlegL.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(20, 80).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 2.9429F, 0.2801F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r197 = hindlegL.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(84, 6).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 7).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.3132F, -0.1327F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r198 = hindlegL.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(84, 2).addBox(5.0F, -0.125F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-5.5F, 1.6763F, 0.6164F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hindlegL2 = hindlegL.addOrReplaceChild("hindlegL2", CubeListBuilder.create().texOffs(33, 80).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(80, 46).addBox(-0.5F, -0.5F, 0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(0.1298F, 4.7163F, 0.3987F, 0.8409F, 0.4883F, 0.9939F));

		PartDefinition cube_r199 = hindlegL2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(91, 64).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(91, 61).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.1F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone4 = hindlegL2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, 0.1495F, -0.039F, -0.869F));

		PartDefinition hindlegL3 = Hips.addOrReplaceChild("hindlegL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5187F, 3.6655F, -2.882F, -1.194F, 0.1774F, 0.8608F));

		PartDefinition cube_r200 = hindlegL3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(43, 81).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 2.9429F, 0.2801F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r201 = hindlegL3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(5, 85).addBox(-0.5F, -1.1F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 91).addBox(-0.5F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 3.3132F, -0.1327F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r202 = hindlegL3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 85).addBox(-6.0F, -0.125F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.5F, 1.6763F, 0.6164F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hindlegL4 = hindlegL3.addOrReplaceChild("hindlegL4", CubeListBuilder.create().texOffs(48, 81).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(81, 63).addBox(-0.5F, -0.5F, 0.6F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.096F)), PartPose.offsetAndRotation(-0.1298F, 4.7163F, 0.3987F, 0.8044F, -0.3058F, -0.9196F));

		PartDefinition cube_r203 = hindlegL4.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(83, 91).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(78, 91).addBox(-0.5F, -0.9F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.1F, 0.5672F, 0.0F, 0.0F));

		PartDefinition bone6 = hindlegL4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(13, 37).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(0.0F, 2.8F, 0.0F, 0.1495F, 0.039F, 0.869F));

		PartDefinition bone3 = Hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r204 = bone3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(84, 14).addBox(-0.5F, -1.1586F, -0.2309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.1F, 0.244F, 1.2497F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r205 = bone3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(89, 13).addBox(-0.5F, -0.4112F, -0.6198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.1F, 0.244F, 1.2497F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r206 = bone3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(65, 28).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0978F, 0.4993F, -0.4806F, 0.3189F, 0.9746F, 0.4211F));

		PartDefinition cube_r207 = bone3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(89, 10).addBox(2.0F, 0.0866F, 0.0444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-2.4F, -0.275F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r208 = bone3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(25, 81).addBox(-1.0F, -0.2136F, -0.5967F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, 1.2435F, -0.1719F, 0.9626F));

		PartDefinition cube_r209 = bone3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(84, 10).addBox(-1.0F, -0.1752F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, -1.0254F, -0.1719F, 0.9626F));

		PartDefinition cube_r210 = bone3.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(47, 48).addBox(-1.0F, 0.6202F, -1.7446F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.35F, 4.2715F, -1.0519F, 0.0654F, -0.1719F, 0.9626F));

		PartDefinition cube_r211 = bone3.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(33, 76).addBox(2.0F, -0.0006F, -2.0263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, 2.0976F, -1.0417F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r212 = bone3.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(19, 76).addBox(2.0F, 0.1994F, -1.9263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.4F, 0.6838F, -1.0079F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r213 = bone3.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(71, 50).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.1F, 3.3479F, -0.3605F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r214 = bone3.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(55, 21).addBox(-0.5F, -0.35F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.1F, -0.0667F, 0.7895F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r215 = bone3.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(9, 89).addBox(2.0F, -0.0006F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.4F, -0.1643F, -0.478F, 1.1868F, 0.0F, 0.0F));

		PartDefinition bone8 = Hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9589F, -0.1318F, -2.0251F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r216 = bone8.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(84, 14).mirror().addBox(-0.5F, -1.1586F, -0.2309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.244F, 1.2497F, 1.2915F, 0.0F, 0.0F));

		PartDefinition cube_r217 = bone8.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(89, 13).mirror().addBox(-0.5F, -0.4112F, -0.6198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.244F, 1.2497F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r218 = bone8.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(65, 28).mirror().addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0978F, 0.4993F, -0.4806F, 0.3189F, -0.9746F, -0.4211F));

		PartDefinition cube_r219 = bone8.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-3.0F, 0.0866F, 0.0444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.275F, -0.55F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r220 = bone8.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(0.0F, -0.2136F, -0.5967F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, 1.2435F, 0.1719F, -0.9626F));

		PartDefinition cube_r221 = bone8.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(0.0F, -0.1752F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, -1.0254F, 0.1719F, -0.9626F));

		PartDefinition cube_r222 = bone8.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(47, 48).mirror().addBox(0.0F, 0.6202F, -1.7446F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.35F, 4.2715F, -1.0519F, 0.0654F, 0.1719F, -0.9626F));

		PartDefinition cube_r223 = bone8.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(33, 76).mirror().addBox(-3.0F, -0.0006F, -2.0263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, 2.0976F, -1.0417F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r224 = bone8.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(19, 76).mirror().addBox(-3.0F, 0.1994F, -1.9263F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.4F, 0.6838F, -1.0079F, 1.405F, 0.0F, 0.0F));

		PartDefinition cube_r225 = bone8.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(71, 50).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 3.3479F, -0.3605F, 1.9024F, 0.0F, 0.0F));

		PartDefinition cube_r226 = bone8.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(55, 21).mirror().addBox(-0.5F, -0.35F, -4.6F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.0667F, 0.7895F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r227 = bone8.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(9, 89).mirror().addBox(-3.0F, -0.0006F, -0.9263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(2.4F, -0.1643F, -0.478F, 1.1868F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
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