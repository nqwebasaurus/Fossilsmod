package fossils.fossils.client.blockentity.model.mymoorapelta;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MymoorapeltaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart Osteoderms5;
	private final ModelPart Osteoderms16;
	private final ModelPart bone2;
	private final ModelPart bone10;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart leftfoot2;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;
	private final ModelPart rightfoot2;
	private final ModelPart bone7;
	private final ModelPart bone15;
	private final ModelPart body;
	private final ModelPart osteoderns;
	private final ModelPart osteoderns2;
	private final ModelPart chest;
	private final ModelPart bone5;
	private final ModelPart bone13;
	private final ModelPart osteoderms4;
	private final ModelPart osteoderms15;
	private final ModelPart bone3;
	private final ModelPart bone11;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck3;
	private final ModelPart osteoderms3;
	private final ModelPart osteoderms14;
	private final ModelPart bone4;
	private final ModelPart bone12;
	private final ModelPart neck2;
	private final ModelPart osteoderms2;
	private final ModelPart osteoderms13;
	private final ModelPart neck;
	private final ModelPart osteoderms;
	private final ModelPart osteoderms6;
	private final ModelPart head;
	private final ModelPart bone;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart bone6;
	private final ModelPart bone14;
	private final ModelPart backPlates2;
	private final ModelPart tail;
	private final ModelPart bone9;
	private final ModelPart bone16;
	private final ModelPart osteoderms12;
	private final ModelPart osteoderms17;
	private final ModelPart osteoderms7;
	private final ModelPart tail2;
	private final ModelPart bone8;
	private final ModelPart bone17;
	private final ModelPart osteoderms8;
	private final ModelPart osteoderms18;
	private final ModelPart tail3;
	private final ModelPart osteoderms9;
	private final ModelPart osteoderms19;
	private final ModelPart tail4;
	private final ModelPart osteoderms10;
	private final ModelPart osteoderms20;
	private final ModelPart tail5;
	private final ModelPart osteoderms11;
	private final ModelPart osteoderms21;

	public MymoorapeltaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.Osteoderms5 = this.hips.getChild("Osteoderms5");
		this.Osteoderms16 = this.hips.getChild("Osteoderms16");
		this.bone2 = this.hips.getChild("bone2");
		this.bone10 = this.hips.getChild("bone10");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.leftfoot2 = this.leftfoot.getChild("leftfoot2");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
		this.rightfoot2 = this.rightfoot.getChild("rightfoot2");
		this.bone7 = this.hips.getChild("bone7");
		this.bone15 = this.hips.getChild("bone15");
		this.body = this.hips.getChild("body");
		this.osteoderns = this.body.getChild("osteoderns");
		this.osteoderns2 = this.body.getChild("osteoderns2");
		this.chest = this.body.getChild("chest");
		this.bone5 = this.chest.getChild("bone5");
		this.bone13 = this.chest.getChild("bone13");
		this.osteoderms4 = this.chest.getChild("osteoderms4");
		this.osteoderms15 = this.chest.getChild("osteoderms15");
		this.bone3 = this.chest.getChild("bone3");
		this.bone11 = this.chest.getChild("bone11");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck3 = this.chest.getChild("neck3");
		this.osteoderms3 = this.neck3.getChild("osteoderms3");
		this.osteoderms14 = this.neck3.getChild("osteoderms14");
		this.bone4 = this.neck3.getChild("bone4");
		this.bone12 = this.neck3.getChild("bone12");
		this.neck2 = this.neck3.getChild("neck2");
		this.osteoderms2 = this.neck2.getChild("osteoderms2");
		this.osteoderms13 = this.neck2.getChild("osteoderms13");
		this.neck = this.neck2.getChild("neck");
		this.osteoderms = this.neck.getChild("osteoderms");
		this.osteoderms6 = this.neck.getChild("osteoderms6");
		this.head = this.neck.getChild("head");
		this.bone = this.head.getChild("bone");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.bone6 = this.body.getChild("bone6");
		this.bone14 = this.body.getChild("bone14");
		this.backPlates2 = this.body.getChild("backPlates2");
		this.tail = this.hips.getChild("tail");
		this.bone9 = this.tail.getChild("bone9");
		this.bone16 = this.tail.getChild("bone16");
		this.osteoderms12 = this.tail.getChild("osteoderms12");
		this.osteoderms17 = this.tail.getChild("osteoderms17");
		this.osteoderms7 = this.tail.getChild("osteoderms7");
		this.tail2 = this.tail.getChild("tail2");
		this.bone8 = this.tail2.getChild("bone8");
		this.bone17 = this.tail2.getChild("bone17");
		this.osteoderms8 = this.tail2.getChild("osteoderms8");
		this.osteoderms18 = this.tail2.getChild("osteoderms18");
		this.tail3 = this.tail2.getChild("tail3");
		this.osteoderms9 = this.tail3.getChild("osteoderms9");
		this.osteoderms19 = this.tail3.getChild("osteoderms19");
		this.tail4 = this.tail3.getChild("tail4");
		this.osteoderms10 = this.tail4.getChild("osteoderms10");
		this.osteoderms20 = this.tail4.getChild("osteoderms20");
		this.tail5 = this.tail4.getChild("tail5");
		this.osteoderms11 = this.tail5.getChild("osteoderms11");
		this.osteoderms21 = this.tail5.getChild("osteoderms21");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -21.0F, 11.2F, 1.0F, 21.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-0.975F, -4.85F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(2.0F, -13.75F, -6.5F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(0.75F, -6.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0F, -13.75F, -6.5F, -0.2618F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-4.1F, -5.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -15.0F, 11.7F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offset(0.0F, -21.7F, 13.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 65).addBox(0.0F, 0.7199F, 0.0834F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(99, 6).addBox(0.0F, 0.7F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -1.0F, -8.3F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Osteoderms5 = hips.addOrReplaceChild("Osteoderms5", CubeListBuilder.create(), PartPose.offset(0.0F, -2.3789F, -6.9791F));

		PartDefinition Osteoderms16 = hips.addOrReplaceChild("Osteoderms16", CubeListBuilder.create(), PartPose.offset(0.0F, -2.3789F, -6.9791F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7074F, -0.3635F, -0.2285F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bone10 = hips.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7074F, -0.3635F, -0.2285F, 0.0F, -0.0436F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8F, 1.4999F, -1.1448F, -0.2705F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9508F, -3.5143F, 0.096F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9883F, 3.4254F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, 0.1134F, 0.0F, 0.0F));

		PartDefinition leftfoot2 = leftfoot.addOrReplaceChild("leftfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1047F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8F, 1.4999F, -1.1448F, 0.384F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 10.9508F, -3.5143F, 0.2705F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 5.9883F, 3.4254F, -0.0087F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5542F, -0.7405F, -0.0175F, 0.0F, 0.0F));

		PartDefinition rightfoot2 = rightfoot.addOrReplaceChild("rightfoot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.939F, -0.2934F, -0.1047F, 0.0F, 0.0F));

		PartDefinition bone7 = hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(7.898F, 1.0309F, -1.2425F));

		PartDefinition bone15 = hips.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.6981F, 1.0309F, -1.7675F, 0.0262F, 0.0349F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3845F, -7.3277F, 0.0438F, -0.0872F, -0.0038F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(73, 32).addBox(0.0F, 0.7082F, 6.0215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(67, 26).addBox(0.0F, 0.7082F, -0.4785F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.2F, -6.8F, 0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderns = body.addOrReplaceChild("osteoderns", CubeListBuilder.create(), PartPose.offset(10.5709F, 4.4635F, 0.0213F));

		PartDefinition osteoderns2 = body.addOrReplaceChild("osteoderns2", CubeListBuilder.create(), PartPose.offset(-10.5709F, 4.4635F, 0.0213F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1983F, -7.1F, 0.0526F, -0.0871F, -0.0046F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(117, 40).addBox(-2.5354F, 0.2838F, -0.1409F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(86, 6).addBox(-2.5354F, 0.0206F, 2.6144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.0354F, 2.5035F, -7.2138F, 0.2793F, 0.0F, 0.0F));

		PartDefinition bone5 = chest.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(1.5155F, -0.713F, -5.1201F));

		PartDefinition bone13 = chest.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5155F, -0.713F, -5.1201F, 0.0F, 0.0698F, 0.0F));

		PartDefinition osteoderms4 = chest.addOrReplaceChild("osteoderms4", CubeListBuilder.create(), PartPose.offsetAndRotation(11.2333F, 5.1399F, -2.9146F, 0.1396F, 0.0F, 0.0F));

		PartDefinition osteoderms15 = chest.addOrReplaceChild("osteoderms15", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.2333F, 5.1399F, -2.9146F, 0.1396F, 0.0F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.8676F, 3.5885F, -6.3414F, -0.0438F, -0.0872F, 0.0038F));

		PartDefinition bone11 = chest.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.8676F, 3.5885F, -6.3414F, -0.0438F, 0.0872F, -0.0038F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.8118F, 7.5705F, -6.8296F, 0.6894F, -0.0008F, -0.2182F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6694F, 5.1524F, 2.2788F, -0.7587F, -0.8086F, 1.3328F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2181F, 5.8808F, -2.9354F, 1.3672F, 0.6437F, -0.5477F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.8118F, 7.5705F, -6.8296F, 0.1222F, 0.0008F, 0.2182F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6694F, 5.1524F, 2.2788F, -0.5992F, 0.9187F, -1.1236F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2181F, 5.8808F, -2.9354F, 0.9309F, -0.6437F, 0.5477F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.7F, -7.5F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(103, 75).addBox(0.0F, 0.1F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F))
				.texOffs(100, 72).addBox(0.0F, 0.1F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition osteoderms3 = neck3.addOrReplaceChild("osteoderms3", CubeListBuilder.create(), PartPose.offsetAndRotation(4.698F, 0.7134F, -3.7876F, -0.0137F, -0.1038F, 0.1316F));

		PartDefinition osteoderms14 = neck3.addOrReplaceChild("osteoderms14", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.698F, 0.7134F, -3.7876F, -0.0137F, 0.1038F, -0.1316F));

		PartDefinition bone4 = neck3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.1F, -2.5052F, -2.0561F));

		PartDefinition bone12 = neck3.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.5052F, -2.0561F, 0.0F, 0.0785F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.7F, -0.0354F, -0.1744F, 0.0062F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 109).addBox(0.0F, 0.1F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(71, 107).addBox(0.0F, 0.1F, -3.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -0.3F, -0.3927F, 0.0F, 0.0F));

		PartDefinition osteoderms2 = neck2.addOrReplaceChild("osteoderms2", CubeListBuilder.create(), PartPose.offset(2.0F, -2.7664F, -2.2484F));

		PartDefinition osteoderms13 = neck2.addOrReplaceChild("osteoderms13", CubeListBuilder.create(), PartPose.offset(-2.0F, -2.7664F, -2.2484F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -3.5F, -0.2657F, -0.1685F, 0.0456F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(86, 13).addBox(0.0F, 0.4781F, -0.8075F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition osteoderms = neck.addOrReplaceChild("osteoderms", CubeListBuilder.create(), PartPose.offset(1.6F, -1.3664F, -1.3484F));

		PartDefinition osteoderms6 = neck.addOrReplaceChild("osteoderms6", CubeListBuilder.create(), PartPose.offset(-1.6F, -1.3664F, -1.3484F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4258F, -3.8931F, -0.3044F, -0.3593F, 0.0056F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(1.1764F, -0.524F, -1.7014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, -0.9406F, -5.724F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.9406F, -5.724F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.2903F, -0.0346F, 0.4454F, 0.0126F, -0.0002F));

		PartDefinition bone6 = body.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(8.4694F, 1.8078F, -3.7899F));

		PartDefinition bone14 = body.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3944F, -1.6922F, -3.8149F, 0.0F, -0.0087F, 0.0F));

		PartDefinition backPlates2 = body.addOrReplaceChild("backPlates2", CubeListBuilder.create(), PartPose.offsetAndRotation(9.7F, 2.9001F, -0.9979F, -0.1586F, 0.4921F, -0.0754F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(67, 35).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(73, 41).addBox(-0.5F, 0.2F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7F, 3.1F, -0.324F, 0.0827F, -0.0278F));

		PartDefinition bone9 = tail.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(1.5F, -2.7033F, 3.914F));

		PartDefinition bone16 = tail.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, -2.6533F, 2.7905F, 0.0305F, 0.0F, 0.0F));

		PartDefinition osteoderms12 = tail.addOrReplaceChild("osteoderms12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6647F, -1.4664F, 9.8728F, 0.0F, 0.1396F, 0.0F));

		PartDefinition osteoderms17 = tail.addOrReplaceChild("osteoderms17", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6647F, -1.4664F, 9.8728F, 0.0F, -0.1396F, 0.0F));

		PartDefinition osteoderms7 = tail.addOrReplaceChild("osteoderms7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -2.4926F, 1.8291F, -0.4189F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0467F, 0.0814F, 0.1419F));

		PartDefinition cube_r12 = tail2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 26).addBox(-0.5F, -0.5F, -7.8F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.7F, 7.9F, 0.0F, -0.0131F, 0.0F));

		PartDefinition bone8 = tail2.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(2.3846F, -2.5586F, -0.0591F));

		PartDefinition bone17 = tail2.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(-2.3846F, -2.5586F, -0.0591F));

		PartDefinition osteoderms8 = tail2.addOrReplaceChild("osteoderms8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition osteoderms18 = tail2.addOrReplaceChild("osteoderms18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8F, -5.1843F, 3.7194F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 36).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 44).addBox(-0.5F, 0.2F, 8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, 0.167F, 0.3446F, 0.0569F));

		PartDefinition osteoderms9 = tail3.addOrReplaceChild("osteoderms9", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition osteoderms19 = tail3.addOrReplaceChild("osteoderms19", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -5.0423F, 4.1522F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(69, 8).addBox(-0.5F, 0.2F, -0.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(75, 14).addBox(-0.5F, 0.2F, 6.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.4048F, 0.216F, 0.0308F));

		PartDefinition osteoderms10 = tail4.addOrReplaceChild("osteoderms10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition osteoderms20 = tail4.addOrReplaceChild("osteoderms20", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8F, -1.2732F, 0.8416F, -0.4014F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1843F, -0.2994F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.016F, 6.9899F, 0.0737F, 0.2592F, -0.0373F));

		PartDefinition osteoderms11 = tail5.addOrReplaceChild("osteoderms11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, -0.2996F, 0.7751F, -0.5062F, 0.0153F, -0.0085F));

		PartDefinition osteoderms21 = tail5.addOrReplaceChild("osteoderms21", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -0.2996F, 0.7751F, -0.5062F, -0.0153F, 0.0085F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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