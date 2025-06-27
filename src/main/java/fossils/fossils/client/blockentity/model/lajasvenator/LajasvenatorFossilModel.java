package fossils.fossils.client.blockentity.model.lajasvenator;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class LajasvenatorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart lefttoes;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart righttoes;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart HEADPART;
	private final ModelPart HEADPART2;
	private final ModelPart HEADPART3;
	private final ModelPart HEADPART5;
	private final ModelPart HEADPART6;
	private final ModelPart HEADPART7;
	private final ModelPart HEADPART8;
	private final ModelPart bone;
	private final ModelPart HEADPART4;
	private final ModelPart HEADPART9;
	private final ModelPart HEADPART10;
	private final ModelPart bone2;
	private final ModelPart HEADPART12;
	private final ModelPart jaw;
	private final ModelPart throat;
	private final ModelPart throatpouch;
	private final ModelPart throat2;

	public LajasvenatorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.lefttoes = this.leftfoot.getChild("lefttoes");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.righttoes = this.rightfoot.getChild("righttoes");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.HEADPART = this.head.getChild("HEADPART");
		this.HEADPART2 = this.HEADPART.getChild("HEADPART2");
		this.HEADPART3 = this.HEADPART2.getChild("HEADPART3");
		this.HEADPART5 = this.head.getChild("HEADPART5");
		this.HEADPART6 = this.HEADPART5.getChild("HEADPART6");
		this.HEADPART7 = this.HEADPART6.getChild("HEADPART7");
		this.HEADPART8 = this.HEADPART7.getChild("HEADPART8");
		this.bone = this.HEADPART8.getChild("bone");
		this.HEADPART4 = this.HEADPART5.getChild("HEADPART4");
		this.HEADPART9 = this.HEADPART4.getChild("HEADPART9");
		this.HEADPART10 = this.HEADPART9.getChild("HEADPART10");
		this.bone2 = this.HEADPART10.getChild("bone2");
		this.HEADPART12 = this.HEADPART5.getChild("HEADPART12");
		this.jaw = this.head.getChild("jaw");
		this.throat = this.jaw.getChild("throat");
		this.throatpouch = this.throat.getChild("throatpouch");
		this.throat2 = this.throat.getChild("throat2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.4F, -4.0F, -0.0153F, -0.2136F, 0.3093F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 50).mirror().addBox(-0.7061F, -3.9901F, -2.6964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, -0.1064F, 0.3052F, 0.2072F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 36).mirror().addBox(-0.7061F, -4.7614F, -1.5995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, 0.3648F, 0.3052F, 0.2072F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(47, 18).mirror().addBox(-1.1863F, -3.6318F, -1.2055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, -0.4929F, -0.2055F, 0.2587F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 55).mirror().addBox(-0.3817F, 2.6046F, 0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(35, 46).mirror().addBox(-0.3817F, 2.6046F, -1.5152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4235F, 2.3689F, -0.7163F, 0.1657F, -0.056F, -0.0377F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 54).mirror().addBox(-0.1011F, -1.0928F, 0.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(36, 42).mirror().addBox(-0.1011F, -1.6928F, -0.9358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, 0.0276F, 0.2039F, -0.3142F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 54).mirror().addBox(-0.3362F, 4.0408F, -0.6838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 37).mirror().addBox(-0.3362F, -1.2592F, -0.5838F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.32F)).mirror(false), PartPose.offsetAndRotation(-0.7405F, 1.3759F, 0.9021F, 0.6251F, -0.0147F, -0.117F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(47, 54).mirror().addBox(-0.3817F, 2.207F, 0.6925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4235F, 2.3689F, -0.7163F, -0.5673F, -0.056F, -0.0377F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 54).mirror().addBox(-0.3817F, 1.9936F, -1.4027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4235F, 2.3689F, -0.7163F, 0.2879F, -0.056F, -0.0377F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 10).mirror().addBox(-0.334F, -0.0609F, -0.4447F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4235F, 2.3689F, -0.7163F, -0.1144F, -0.0513F, -0.0209F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(10, 49).mirror().addBox(-0.3002F, -2.4411F, -2.0602F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, 0.0062F, -0.0779F, -0.266F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-0.3491F, -1.5697F, 0.724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, 0.625F, 0.1949F, -0.1185F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 20).mirror().addBox(-0.2339F, -2.8789F, -2.0436F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, -0.1515F, -0.0418F, -0.2063F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 26).mirror().addBox(-1.1211F, -2.6998F, 0.6522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, 0.0508F, -0.2089F, 0.233F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 10).mirror().addBox(-1.1765F, -3.7199F, -2.2019F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6235F, 2.3689F, 0.8837F, -0.2269F, 0.0F, 0.2182F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(10, 10).addBox(0.1765F, -3.7199F, -2.2019F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, -0.2269F, 0.0F, -0.2182F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(47, 18).addBox(0.1863F, -3.6318F, -1.2055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, -0.4929F, 0.2055F, -0.2587F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 26).addBox(0.1211F, -2.6998F, 0.6522F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, 0.0508F, 0.2089F, -0.233F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 20).addBox(-0.7661F, -2.8789F, -2.0436F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, -0.1515F, 0.0418F, 0.2063F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(51, 36).addBox(-0.2939F, -4.7614F, -1.5995F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, 0.3648F, -0.3052F, -0.2072F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(51, 50).addBox(-0.2939F, -3.9901F, -2.6964F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, -0.1064F, -0.3052F, -0.2072F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(37, 54).addBox(-0.8989F, -1.0928F, 0.0642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(36, 42).addBox(-0.8989F, -1.6928F, -0.9358F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, 0.0276F, -0.2039F, 0.3142F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(55, 0).addBox(-0.6509F, -1.5697F, 0.724F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, 0.625F, -0.1949F, 0.1185F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 54).addBox(-0.6638F, 4.0408F, -0.6838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(5, 37).addBox(-0.6638F, -1.2592F, -0.5838F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.32F)), PartPose.offsetAndRotation(0.7405F, 1.3759F, 0.9021F, 0.6251F, 0.0147F, 0.117F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(10, 49).addBox(-0.6998F, -2.4411F, -2.0602F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6235F, 2.3689F, 0.8837F, 0.0062F, 0.0779F, 0.266F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(20, 10).addBox(-0.666F, -0.0609F, -0.4447F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4235F, 2.3689F, -0.7163F, -0.1144F, 0.0513F, 0.0209F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 55).addBox(-0.6183F, 2.6046F, 0.0848F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(35, 46).addBox(-0.6183F, 2.6046F, -1.5152F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4235F, 2.3689F, -0.7163F, 0.1657F, 0.056F, 0.0377F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(52, 54).addBox(-0.6183F, 1.9936F, -1.4027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4235F, 2.3689F, -0.7163F, 0.2879F, 0.056F, 0.0377F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(47, 54).addBox(-0.6183F, 2.207F, 0.6925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4235F, 2.3689F, -0.7163F, -0.5673F, 0.056F, 0.0377F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(17, 19).addBox(-1.0F, -0.1F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F))
				.texOffs(29, 23).addBox(-0.5F, -1.1F, 0.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0152F, 1.0331F, 0.1521F, 0.0571F, 0.0F, 0.0F));

		PartDefinition cube_r30 = leftleg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -1.0F, -1.15F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.061F, 0.6973F, -0.0873F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create().texOffs(38, 35).addBox(-0.7F, 1.1627F, -0.0244F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(42, 16).addBox(-0.7F, 0.2627F, -0.5244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.339F, -0.5027F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r31 = leftleg2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(15, 37).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.0F, 3.2179F, 0.1793F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create().texOffs(25, 39).addBox(-0.9F, -0.03F, -1.0919F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 6.4627F, 0.8756F, -0.6004F, -0.0494F, -0.072F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(28, 10).addBox(-1.5F, -0.1585F, -2.0612F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.57F, -0.3419F, 1.2305F, 0.0F, 0.0F));

		PartDefinition lefttoes = leftfoot.addOrReplaceChild("lefttoes", CubeListBuilder.create().texOffs(34, 0).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.3415F, -2.1612F, 0.4363F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0274F, 1.4116F, 0.2966F, -0.7688F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightleg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(33, 35).addBox(-0.5F, -1.0F, -1.15F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.061F, 0.6973F, -0.0873F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create().texOffs(20, 38).addBox(-0.3F, 1.1627F, -0.0244F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(41, 40).addBox(-0.3F, 0.2627F, -0.5244F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.339F, -0.5027F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightleg2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(10, 37).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.0F, 3.2179F, 0.1793F, 0.0524F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create().texOffs(39, 11).addBox(-1.1F, -0.03F, -1.0919F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.2F, 6.4627F, 0.8756F, -1.3439F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(10, 19).addBox(-1.5F, -0.1585F, -2.0612F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.57F, -0.3419F, 1.7104F, 0.0F, 0.0F));

		PartDefinition righttoes = rightfoot.addOrReplaceChild("righttoes", CubeListBuilder.create().texOffs(33, 19).addBox(-1.5F, -0.5F, -0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.3415F, -2.1612F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(20, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(59, 20).addBox(0.0F, -1.1F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 59).addBox(0.0F, -1.1F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 58).addBox(0.0F, -1.1F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 2.9F, -0.143F, 0.216F, -0.0308F));

		PartDefinition cube_r34 = tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, 1.541F, 3.5421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 23).addBox(0.0F, -0.0082F, 1.6878F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 26).addBox(0.0F, -0.8502F, -0.1291F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, 0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(58, 45).addBox(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 31).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(29, 58).addBox(0.0F, -0.8F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.9F, 0.1715F, 0.2581F, 0.0442F));

		PartDefinition cube_r35 = tail2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 3.9752F, 8.6095F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 50).addBox(0.0F, 3.0155F, 6.8519F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 52).addBox(0.0F, 2.141F, 5.0421F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.4F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(14, 1).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(58, 17).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(17, 58).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 58).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 11).addBox(0.0F, -0.9F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.0186F, -0.349F, 0.0064F));

		PartDefinition cube_r36 = tail3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(33, 14).addBox(0.0F, 5.726F, 12.1041F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 23).addBox(0.0F, 4.7971F, 10.3301F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -11.4F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(10, 10).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.005F))
				.texOffs(0, 58).addBox(0.0F, -0.8F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(51, 57).addBox(0.0F, -0.8F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 57).addBox(0.0F, -0.7F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.1485F, -0.3455F, 0.0506F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, -0.25F, -0.2116F, 0.0536F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, 0.0076F, -0.0869F, -0.0876F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(32, 59).addBox(-0.5F, -0.881F, -1.9539F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 32).addBox(-1.0F, 0.019F, -2.9539F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -0.8F, -4.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1558F, -1.5359F, -0.0968F, -0.04F, -0.6002F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 29).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1558F, -1.5359F, -0.0742F, -0.074F, -0.9921F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(52, 10).mirror().addBox(-3.5298F, -1.2278F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1558F, -1.5359F, -0.0316F, -0.0999F, -1.4732F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(33, 57).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2558F, -3.5359F, 0.0F, 0.0F, -0.4625F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(38, 57).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2558F, -3.5359F, 0.0F, 0.0F, -0.8552F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(43, 5).mirror().addBox(-4.5298F, -1.2278F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2558F, -3.5359F, 0.0F, 0.0F, -1.3352F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-4.5298F, -1.2278F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2558F, -5.4359F, 0.0263F, 0.0832F, -1.2643F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(43, 57).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2558F, -5.4359F, 0.0618F, 0.0617F, -0.7835F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(57, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2558F, -5.4359F, 0.0807F, 0.0334F, -0.3914F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(52, 10).addBox(1.5298F, -1.2278F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1558F, -1.5359F, -0.0316F, 0.0999F, 1.4732F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(57, 29).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1558F, -1.5359F, -0.0742F, 0.074F, 0.9921F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1558F, -1.5359F, -0.0968F, 0.04F, 0.6002F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(43, 5).addBox(1.5298F, -1.2278F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2558F, -3.5359F, 0.0F, 0.0F, 1.3352F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(38, 57).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2558F, -3.5359F, 0.0F, 0.0F, 0.8552F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(33, 57).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2558F, -3.5359F, 0.0F, 0.0F, 0.4625F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(43, 25).addBox(1.5298F, -1.2278F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2558F, -5.4359F, 0.0263F, -0.0832F, 1.2643F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(43, 57).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2558F, -5.4359F, 0.0618F, -0.0617F, 0.7835F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(57, 43).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2558F, -5.4359F, 0.0807F, -0.0334F, 0.3914F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(23, 59).addBox(-0.5F, -1.4F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 59).addBox(-0.5F, -1.3F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 26).addBox(-1.0F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-2.5F, -1.5F, -5.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0478F, -2.3579F, -0.1396F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -7.0F, 0.0077F, -0.1744F, -0.0443F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(35, 59).addBox(-0.5F, -0.9463F, 2.0643F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 59).addBox(-0.5F, -0.9463F, 0.0643F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 32).addBox(-1.0F, -0.1463F, 0.0643F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0F, -2.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(25, 17).mirror().addBox(0.0414F, -0.0149F, -0.508F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6576F, 3.8766F, -1.9324F, -0.182F, -0.582F, 0.3739F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(34, 23).mirror().addBox(-0.4F, 0.0F, -1.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5683F, 3.7808F, -0.987F, -0.3524F, -0.7159F, 0.5119F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(50, 25).mirror().addBox(2.6208F, 0.8723F, 1.3018F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.6162F, -5.6045F, -0.3076F, -1.1877F, 0.573F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(52, 4).mirror().addBox(0.0F, -1.4141F, -1.9676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 2.7525F, -1.6673F, 0.5742F, -0.4356F, -0.2665F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(0.0F, -1.0439F, -0.0962F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 26).addBox(4.2F, -1.0439F, -0.0962F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6F, 2.8525F, -2.3673F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(53, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2442F, -2.3359F, 0.259F, 0.1057F, -0.536F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(56, 27).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2442F, -2.3359F, 0.2F, 0.1962F, -0.9227F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(51, 46).mirror().addBox(-3.5298F, -1.2278F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2442F, -2.3359F, 0.086F, 0.266F, -1.4109F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(56, 37).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0442F, -0.3359F, 0.1453F, 0.0599F, -0.3883F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(57, 15).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0442F, -0.3359F, 0.1115F, 0.1108F, -0.7792F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(24, 6).mirror().addBox(-4.5298F, -1.2278F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0442F, -0.3359F, 0.0476F, 0.1498F, -1.2618F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(51, 46).addBox(1.5298F, -1.2278F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2442F, -2.3359F, 0.086F, -0.266F, 1.4109F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(56, 27).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2442F, -2.3359F, 0.2F, -0.1962F, 0.9227F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(53, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2442F, -2.3359F, 0.259F, -0.1057F, 0.536F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(24, 6).addBox(1.5298F, -1.2278F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0442F, -0.3359F, 0.0476F, -0.1498F, 1.2618F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(57, 15).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0442F, -0.3359F, 0.1115F, -0.1108F, 0.7792F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(56, 37).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0442F, -0.3359F, 0.1453F, -0.0599F, 0.3883F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(52, 4).addBox(-1.0F, -1.4141F, -1.9676F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 2.7525F, -1.6673F, 0.5742F, 0.4356F, 0.2665F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(38, 27).addBox(-1.5F, -0.8558F, -0.0369F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 3.0162F, -4.0045F, -0.672F, 0.0F, 0.0F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(43, 34).addBox(-0.5F, -0.6191F, 0.893F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0162F, -4.0045F, -0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(50, 25).addBox(-3.6208F, 0.8723F, 1.3018F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.6162F, -5.6045F, -0.3076F, 1.1877F, -0.573F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(34, 23).addBox(-0.6F, 0.0F, -1.4F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5683F, 3.7808F, -0.987F, -0.3524F, 0.7159F, -0.5119F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(25, 17).addBox(-1.0414F, -0.0149F, -0.508F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6576F, 3.8766F, -1.9324F, -0.182F, 0.582F, -0.3739F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 8).addBox(-2.0F, -1.0252F, -1.0948F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 5.1F, -0.3F, -0.4712F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(16, 0).addBox(-0.6639F, -0.3822F, -0.5387F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.1662F, -2.8045F, 0.6954F, 0.3468F, -0.0594F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create().texOffs(5, 49).addBox(-0.5F, -0.5F, 0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(33, 50).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1639F, 2.4178F, -0.2387F, -0.8727F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(0, 17).addBox(-1.1F, 0.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 2.4F, 0.8F, 0.0F, 0.0F, 0.3054F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 0).addBox(-0.3361F, -0.3822F, -0.5387F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7F, 3.1662F, -2.8045F, 0.6954F, -0.3468F, 0.0594F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5F, -0.5F, 0.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(41, 49).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1639F, 2.4178F, -0.2387F, -0.8727F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(0, 8).addBox(0.1F, 0.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 2.4F, 0.8F, 0.0F, 0.0F, -0.3054F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(18, 32).addBox(-0.5F, -0.532F, -2.9835F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.7F, 0.0361F, -0.3911F, -0.0944F));

		PartDefinition cube_r83 = neck3.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(41, 59).addBox(-0.5F, -0.932F, 0.0165F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r84 = neck3.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(31, 8).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0558F, -1.5359F, 0.4406F, -0.6992F, 0.949F));

		PartDefinition cube_r85 = neck3.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(43, 38).addBox(0.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0558F, -1.5359F, 0.0796F, -0.8031F, 1.4708F));

		PartDefinition cube_r86 = neck3.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 38).mirror().addBox(-1.9239F, -0.3827F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0558F, -1.5359F, 0.0796F, 0.8031F, -1.4708F));

		PartDefinition cube_r87 = neck3.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(31, 8).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0558F, -1.5359F, 0.4406F, 0.6992F, -0.949F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, -2.7F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition cube_r88 = neck2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(24, 0).addBox(-0.5F, -0.9461F, -0.8379F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4F, 0.3F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r89 = neck2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(2, 60).addBox(-0.5F, -1.0045F, 0.926F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 26).addBox(-1.0F, -0.0045F, -0.074F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.8F, -2.6F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r90 = neck2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(51, 42).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3558F, -0.8359F, 0.2941F, 0.7622F, -1.1679F));

		PartDefinition cube_r91 = neck2.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 28).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6558F, -2.4359F, 0.278F, 0.7671F, -1.1911F));

		PartDefinition cube_r92 = neck2.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(50, 28).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6558F, -2.4359F, 0.278F, -0.7671F, 1.1911F));

		PartDefinition cube_r93 = neck2.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(51, 42).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3558F, -0.8359F, 0.2941F, -0.7622F, 1.1679F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.3F, -2.7F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r94 = neck.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 59).addBox(0.0F, -0.8124F, -0.1306F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7209F, -0.7107F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r95 = neck.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(24, 32).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1442F, -0.9359F, 0.2777F, 0.9364F, -1.1453F));

		PartDefinition cube_r96 = neck.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(24, 32).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1442F, -0.9359F, 0.2777F, -0.9364F, 1.1453F));

		PartDefinition cube_r97 = neck.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(23, 44).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -0.1F, -1.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.4868F, -1.6448F, -0.0226F, -0.0843F, 0.2628F));

		PartDefinition cube_r98 = head.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(5, 54).mirror().addBox(-0.6F, -0.9499F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(5, 54).addBox(0.8F, -0.9499F, -0.4969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 0.7139F, -0.4067F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r99 = head.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(42, 2).mirror().addBox(-1.2F, -0.8F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(42, 2).addBox(0.2F, -0.8F, -0.825F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.5F, 0.9713F, -0.1258F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r100 = head.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(42, 2).mirror().addBox(-1.2F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false)
				.texOffs(42, 2).addBox(0.2F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.5F, 0.6866F, 0.1415F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r101 = head.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(40, 30).mirror().addBox(-0.5F, -0.2018F, -1.7181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(40, 30).addBox(0.9F, -0.2018F, -1.7181F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2F, 0.7139F, 0.3933F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r102 = head.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(6, 32).mirror().addBox(-0.6F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F)).mirror(false)
				.texOffs(15, 32).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(6, 32).addBox(0.8F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.202F))
				.texOffs(15, 32).addBox(0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, -0.6968F, 0.0629F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r103 = head.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 17).addBox(-0.5F, -0.0925F, -0.4127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.5451F, -0.8181F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r104 = head.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(47, 15).addBox(-1.0F, -0.0925F, -0.0127F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.5451F, -0.8181F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r105 = head.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(32, 31).addBox(-1.0F, -2.3988F, -0.9789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(32, 31).addBox(-1.0F, -2.3988F, -0.4789F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, 1.2032F, -1.2524F, -0.2182F, 0.0F, 0.0F));

		PartDefinition HEADPART = head.addOrReplaceChild("HEADPART", CubeListBuilder.create().texOffs(20, 52).addBox(-0.9F, 0.9933F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.018F))
				.texOffs(20, 52).mirror().addBox(-1.1F, 0.9933F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.6468F, -2.3524F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r106 = HEADPART.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(46, 11).mirror().addBox(-0.4F, -0.0267F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.1F, 0.4F, -0.0915F, -0.3042F, 0.0275F));

		PartDefinition cube_r107 = HEADPART.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(46, 11).addBox(-0.6F, -0.0267F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.4F, -0.0915F, 0.3042F, -0.0275F));

		PartDefinition cube_r108 = HEADPART.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(46, 11).addBox(-1.0F, -0.0267F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 1.1F, 0.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition HEADPART2 = HEADPART.addOrReplaceChild("HEADPART2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.95F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r109 = HEADPART2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(46, 7).mirror().addBox(-0.1F, -0.0133F, -1.9488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.0203F)).mirror(false)
				.texOffs(46, 7).addBox(0.1F, -0.0133F, -1.9488F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(-1.0F, 1.6F, 2.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition HEADPART3 = HEADPART2.addOrReplaceChild("HEADPART3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r110 = HEADPART3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(55, 34).mirror().addBox(0.0F, -0.0729F, -0.9677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.6F, 2.4F, -0.3142F, 0.0F, 0.0F));

		PartDefinition HEADPART5 = head.addOrReplaceChild("HEADPART5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.8032F, -10.3024F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r111 = HEADPART5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(46, 29).addBox(-0.4F, -0.9052F, -0.1307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5F, -1.8279F, 5.4967F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r112 = HEADPART5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-0.6F, -0.9052F, -0.1307F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8279F, 5.4967F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r113 = HEADPART5.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.2529F, 5.0967F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r114 = HEADPART5.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(46, 29).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.5F, -2.2529F, 5.0967F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r115 = HEADPART5.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(46, 29).mirror().addBox(-0.6F, -0.1096F, -0.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.8029F, 4.1467F, -0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r116 = HEADPART5.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(46, 46).mirror().addBox(0.2238F, -1.1965F, -2.4587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.8731F, 8.4745F, 0.0812F, -0.099F, 0.0342F));

		PartDefinition cube_r117 = HEADPART5.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(46, 46).addBox(-1.2238F, -1.1965F, -2.4587F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(0.5F, -1.8731F, 8.4745F, 0.0812F, 0.099F, -0.0342F));

		PartDefinition cube_r118 = HEADPART5.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(46, 29).addBox(-0.4F, -0.1096F, -0.0669F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.097F)), PartPose.offsetAndRotation(-0.5F, -2.8029F, 4.1467F, -0.2138F, 0.0F, 0.0F));

		PartDefinition HEADPART6 = HEADPART5.addOrReplaceChild("HEADPART6", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, -3.85F, 6.75F, 0.4979F, 0.0021F, 0.198F));

		PartDefinition HEADPART7 = HEADPART6.addOrReplaceChild("HEADPART7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3398F, 0.8458F, 2.1445F, -0.032F, 0.2419F, 0.0738F));

		PartDefinition cube_r119 = HEADPART7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(36, 5).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.069F, 0.2066F, -0.4198F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r120 = HEADPART7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(36, 5).addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.069F, -0.184F, -1.0341F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r121 = HEADPART7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(35, 4).addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.069F, -0.1947F, -1.7411F, -0.1571F, 0.0F, 0.0F));

		PartDefinition HEADPART8 = HEADPART7.addOrReplaceChild("HEADPART8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.431F, 1.2053F, 0.6589F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r122 = HEADPART8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 54).addBox(-0.475F, -0.275F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.5F, -1.1F, -0.3F, -1.3709F, -0.186F, -0.4188F));

		PartDefinition bone = HEADPART8.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-0.5F, -1.1F, -0.3F));

		PartDefinition HEADPART4 = HEADPART5.addOrReplaceChild("HEADPART4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -3.85F, 6.75F, 0.4979F, -0.0021F, -0.198F));

		PartDefinition HEADPART9 = HEADPART4.addOrReplaceChild("HEADPART9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3398F, 0.8458F, 2.1445F, -0.032F, -0.2419F, -0.0738F));

		PartDefinition cube_r123 = HEADPART9.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.069F, 0.2066F, -0.4198F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r124 = HEADPART9.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(36, 5).mirror().addBox(-0.5F, -0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.069F, -0.184F, -1.0341F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r125 = HEADPART9.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(35, 4).mirror().addBox(-0.5F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.069F, -0.1947F, -1.7411F, -0.1571F, 0.0F, 0.0F));

		PartDefinition HEADPART10 = HEADPART9.addOrReplaceChild("HEADPART10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.431F, 1.2053F, 0.6589F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r126 = HEADPART10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(0, 54).mirror().addBox(-0.525F, -0.275F, -0.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.1F, -0.3F, -1.3709F, 0.186F, 0.4188F));

		PartDefinition bone2 = HEADPART10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.5F, -1.1F, -0.3F));

		PartDefinition HEADPART12 = HEADPART5.addOrReplaceChild("HEADPART12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, 4.55F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = HEADPART12.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(57, 59).mirror().addBox(-0.11F, -1.0365F, -1.0136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 59).addBox(0.71F, -1.0365F, -1.0136F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -1.1094F, 1.3711F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r128 = HEADPART12.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(4, 57).mirror().addBox(0.15F, 0.9F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 7).mirror().addBox(0.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(56, 56).mirror().addBox(0.25F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(4, 57).addBox(0.93F, 0.9F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 56).addBox(0.83F, -0.1F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(56, 7).addBox(0.83F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.54F, -2.5796F, 0.3945F, 2.0159F, 0.0F, 0.0F));

		PartDefinition cube_r129 = HEADPART12.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(25, 17).mirror().addBox(0.2988F, -0.2628F, -2.5616F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.8231F, 3.9245F, -0.0284F, -0.0937F, 0.0469F));

		PartDefinition cube_r130 = HEADPART12.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(0.0921F, -0.4309F, -1.6786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -1.8231F, 3.9245F, -0.2274F, -0.1787F, 0.0666F));

		PartDefinition cube_r131 = HEADPART12.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(20, 56).mirror().addBox(-0.3628F, -0.5944F, -0.6317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false)
				.texOffs(56, 51).mirror().addBox(-0.3628F, -0.5944F, -0.2317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.165F, -2.4655F, 3.5494F, 1.7431F, -0.1809F, 0.0471F));

		PartDefinition cube_r132 = HEADPART12.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(55, 48).mirror().addBox(-0.3628F, -0.8468F, -0.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(-1.165F, -2.4655F, 3.5494F, 2.3191F, -0.1809F, 0.0471F));

		PartDefinition cube_r133 = HEADPART12.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-0.3628F, -0.004F, -0.2291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(-1.165F, -2.4655F, 3.5494F, 1.7257F, -0.1809F, 0.0471F));

		PartDefinition cube_r134 = HEADPART12.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(57, 3).mirror().addBox(-0.3628F, -0.6108F, -0.065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.165F, -2.4655F, 3.5494F, -0.3862F, -0.1809F, 0.0471F));

		PartDefinition cube_r135 = HEADPART12.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(25, 52).mirror().addBox(-0.3628F, -1.0915F, -1.0134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.165F, -2.4655F, 3.5494F, 1.237F, -0.1809F, 0.0471F));

		PartDefinition cube_r136 = HEADPART12.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(25, 17).addBox(-0.2988F, -0.2628F, -2.5616F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8231F, 3.9245F, -0.0284F, 0.0937F, -0.0469F));

		PartDefinition cube_r137 = HEADPART12.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(54, 20).mirror().addBox(-0.17F, 2.6852F, 4.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(10, 54).mirror().addBox(-0.29F, 2.6852F, 4.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F)).mirror(false)
				.texOffs(10, 54).addBox(1.49F, 2.6852F, 4.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.33F))
				.texOffs(54, 20).addBox(1.37F, 2.6852F, 4.1831F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.6F, -7.5F, 2.7F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r138 = HEADPART12.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(-0.5F, -1.1F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(15, 51).addBox(0.98F, -1.1F, -1.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.24F, -1.6228F, 5.8314F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r139 = HEADPART12.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(46, 50).mirror().addBox(-0.5F, -1.5897F, -0.8569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(46, 50).addBox(0.98F, -1.5897F, -0.8569F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.24F, -1.3228F, 4.9314F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r140 = HEADPART12.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(53, 12).mirror().addBox(-0.5F, -0.9328F, -0.3263F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)).mirror(false)
				.texOffs(53, 12).addBox(1.18F, -0.8829F, -0.3233F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.305F)), PartPose.offsetAndRotation(-1.34F, -1.8228F, 5.5314F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r141 = HEADPART12.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(53, 30).mirror().addBox(-0.5F, -1.7612F, -0.2759F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(53, 30).addBox(1.18F, -1.7123F, -0.2867F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.34F, -0.9228F, 5.4314F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r142 = HEADPART12.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(20, 56).addBox(-0.6372F, -0.5944F, -0.6317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F))
				.texOffs(56, 51).addBox(-0.6372F, -0.5944F, -0.2317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.165F, -2.4655F, 3.5494F, 1.7431F, 0.1809F, -0.0471F));

		PartDefinition cube_r143 = HEADPART12.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(9, 57).addBox(-0.6372F, -0.004F, -0.2291F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(0.165F, -2.4655F, 3.5494F, 1.7257F, 0.1809F, -0.0471F));

		PartDefinition cube_r144 = HEADPART12.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 48).addBox(-0.6372F, -0.8468F, -0.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(0.165F, -2.4655F, 3.5494F, 2.3191F, 0.1809F, -0.0471F));

		PartDefinition cube_r145 = HEADPART12.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(25, 52).addBox(-0.6372F, -1.0915F, -1.0134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.165F, -2.4655F, 3.5494F, 1.237F, 0.1809F, -0.0471F));

		PartDefinition cube_r146 = HEADPART12.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(57, 3).addBox(-0.6372F, -0.6108F, -0.065F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(0.165F, -2.4655F, 3.5494F, -0.3862F, 0.1809F, -0.0471F));

		PartDefinition cube_r147 = HEADPART12.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(47, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -3.2F, 5.6F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r148 = HEADPART12.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0921F, -0.4309F, -1.6786F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, -1.8231F, 3.9245F, -0.2274F, 0.1787F, -0.0666F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(14, 45).addBox(0.0F, -0.2413F, -1.2619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(14, 45).mirror().addBox(-1.4F, -0.2413F, -1.2619F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.8532F, 0.2476F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r149 = jaw.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(55, 39).mirror().addBox(-1.0F, -0.2582F, -0.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.4F, -0.2413F, -1.7619F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r150 = jaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(55, 23).mirror().addBox(-0.02F, 1.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(29, 55).mirror().addBox(-0.02F, 1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(55, 23).addBox(1.62F, 1.7F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(29, 55).addBox(1.62F, 1.3F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.5F, 1.0816F, -3.5178F, 1.5097F, 0.0F, 0.0F));

		PartDefinition cube_r151 = jaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(26, 48).mirror().addBox(-1.0F, -0.7777F, -1.7817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(34, 15).mirror().addBox(-1.0F, -1.2777F, -1.3817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(34, 15).addBox(0.4F, -1.2777F, -1.3817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.197F))
				.texOffs(26, 48).addBox(0.4F, -0.7777F, -1.7817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 1.1587F, -0.9619F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r152 = jaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(48, 32).mirror().addBox(-1.0F, -0.8205F, -1.8365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(48, 32).addBox(0.4F, -0.8205F, -1.8365F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-0.4F, 0.4587F, 0.5381F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r153 = jaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(7, 45).mirror().addBox(-1.0F, -0.2254F, -1.2115F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(7, 45).addBox(0.4F, -0.2254F, -1.2115F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(-0.4F, 0.0587F, -0.7619F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r154 = jaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(55, 39).mirror().addBox(-0.2F, -0.2582F, -0.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(46, 42).mirror().addBox(-0.2F, -0.2582F, -2.068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.2413F, -1.7619F, -0.0087F, -0.2094F, 0.0F));

		PartDefinition cube_r155 = jaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(35, 16).mirror().addBox(-0.35F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false)
				.texOffs(35, 16).mirror().addBox(-0.35F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 0.3681F, -2.4368F, -0.0089F, -0.2225F, 0.002F));

		PartDefinition cube_r156 = jaw.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(19, 48).mirror().addBox(-0.2F, 0.8207F, -1.7605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-1.2F, -0.2413F, -1.7619F, -0.5323F, -0.2094F, 0.0F));

		PartDefinition cube_r157 = jaw.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(35, 16).addBox(-0.65F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F))
				.texOffs(35, 16).addBox(-0.65F, -0.5F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5F, 0.3681F, -2.4368F, -0.0089F, 0.2225F, -0.002F));

		PartDefinition cube_r158 = jaw.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(19, 48).addBox(-0.8F, 0.8207F, -1.7605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.8F, -0.2413F, -1.7619F, -0.5323F, 0.2094F, 0.0F));

		PartDefinition cube_r159 = jaw.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(18, 26).mirror().addBox(-0.4F, -0.6378F, -1.4132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(18, 26).addBox(-0.4F, -0.6378F, -1.4132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.3F, -0.5196F, -5.1208F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r160 = jaw.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(30, 44).mirror().addBox(-0.4F, -0.2378F, -1.4132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.203F)).mirror(false)
				.texOffs(30, 44).addBox(-0.2F, -0.2378F, -1.4132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, -0.5196F, -5.2208F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r161 = jaw.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(46, 38).mirror().addBox(-0.1F, -0.3474F, -1.5876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(41, 44).mirror().addBox(-0.2F, 0.0067F, -2.0645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-0.85F, -0.3413F, -3.3619F, -0.2269F, -0.1396F, 0.0F));

		PartDefinition cube_r162 = jaw.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(-0.2F, -0.1783F, -1.6589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.85F, -0.3413F, -3.3619F, -0.1222F, -0.1396F, 0.0F));

		PartDefinition cube_r163 = jaw.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(41, 44).addBox(-0.8F, 0.0067F, -2.0645F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F))
				.texOffs(46, 38).addBox(-0.9F, -0.3474F, -1.5876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.45F, -0.3413F, -3.3619F, -0.2269F, 0.1396F, 0.0F));

		PartDefinition cube_r164 = jaw.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 45).addBox(-0.8F, -0.1783F, -1.6589F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.45F, -0.3413F, -3.3619F, -0.1222F, 0.1396F, 0.0F));

		PartDefinition cube_r165 = jaw.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(55, 39).addBox(-0.8F, -0.2582F, -0.768F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(46, 42).addBox(-0.8F, -0.2582F, -2.068F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, -0.2413F, -1.7619F, -0.0087F, 0.2094F, 0.0F));

		PartDefinition throat = jaw.addOrReplaceChild("throat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5587F, -4.2619F, -0.0873F, 0.0F, 0.0F));

		PartDefinition throatpouch = throat.addOrReplaceChild("throatpouch", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition throat2 = throat.addOrReplaceChild("throat2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.3491F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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